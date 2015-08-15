package jp.co.smartservice.app.user;

import javax.inject.Inject;
import javax.validation.groups.Default;

import org.dozer.Mapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.terasoluna.gfw.common.exception.BusinessException;
import org.terasoluna.gfw.common.message.ResultMessages;
import org.terasoluna.gfw.common.query.QueryEscapeUtils;

import jp.co.smartservice.app.user.UserForm.UserRegister;
import jp.co.smartservice.domain.common.constants.Constants;
import jp.co.smartservice.domain.model.T001User;
import jp.co.smartservice.domain.model.T001UserExample;
import jp.co.smartservice.domain.service.user.UserSharedService;

@Controller
@RequestMapping("user")
public class UserController {

    @Inject
    Mapper beanMapper;

    @Inject
	UserSharedService userSharedService;

	@ModelAttribute
	public UserForm setUpUserForm() {
		UserForm userform = new UserForm();
		return userform;
	}

	@RequestMapping(value= "register")
	public String createForm(UserForm userForm, Model model) {
		return "user/userinfo";
	}

	@RequestMapping(value= "register", method = RequestMethod.POST, params = "redo")
	public String createRedo(UserForm userForm, Model model) {
		return "user/userinfo";
	}

	@RequestMapping(value = "register", method = RequestMethod.POST, params = "save")
	public String register(@Validated({Default.class, UserRegister.class}) UserForm userForm,
			BindingResult bingdingResult, Model model, RedirectAttributes attributes) {

		if (bingdingResult.hasErrors()) {
			return createRedo(userForm, model);
		}
		T001User t001User = beanMapper.map(userForm, T001User.class);

        try {
        	userSharedService.register(t001User);
        } catch (BusinessException e) {
            model.addAttribute(e.getResultMessages());
            return createRedo(userForm, model);
        }

        ResultMessages messages = ResultMessages.success().add("i.oa.fw.0001");
        model.addAttribute(messages);

        return createRedo(userForm, model);
        //attributes.addFlashAttribute(messages);
		//return "redirect:/todo/list";

	}

	@RequestMapping(value = "list")
	public String list(@PageableDefault(10) Pageable pageable, UserForm userForm, Model model) {

		T001UserExample example = new T001UserExample();
		String keywords = userForm.getKeywords();
		if (keywords != null && !Constants.STR_EMPTY.equals(keywords.trim())) {
			keywords = QueryEscapeUtils.toContainingCondition(keywords.trim());
			example.createCriteria().andUserIdLike(keywords);
			example.or().andNameKanjiLike(keywords);
			example.or().andEmailLike(keywords);
			example.or().andTelNoLike(keywords);
			example.or().andJoinedDateLike(keywords.replaceAll(Constants.DATE_REPLACEMENT_REGEX, Constants.STR_EMPTY));
		}
		example.setOrderByClause("user_id ASC");
		Page<T001User> page = userSharedService.findPage(example, pageable);
		model.addAttribute("page", page);
		return "user/userlist";
	}


//	@RequestMapping(value = "list", method = RequestMethod.POST, params= "finish")
//	public String finish(@Validated({Default.class, TodoFinish.class}) TodoForm form,
//			BindingResult bindingResult, @PageableDefault(10) Pageable pageable,
//			Model model, RedirectAttributes attributes) {
//
//		if (bindingResult.hasErrors()) {
//			return list(pageable, model);
//		}
//
//		try{
//			todoService.finish(form.getTodoId());
//		} catch (BusinessException e) {
//			model.addAttribute(e.getResultMessages());
//			return list(pageable, model);
//		}
//
//		ResultMessages messages = ResultMessages.success();
//		messages.add(ResultMessage.fromText("Finished successfully!"));
//		attributes.addFlashAttribute(messages);
//
//		return "redirect:/todo/list";
//	}
//
//	@RequestMapping(value = "list", method = RequestMethod.POST, params="delete")
//	public String delete(@Validated({Default.class, TodoDelete.class}) TodoForm form,
//			BindingResult bindingResult, @PageableDefault(10) Pageable pageable,
//			Model model, RedirectAttributes attributes) {
//
//		if (bindingResult.hasErrors()) {
//			return list(pageable, model);
//		}
//		try{
//			todoService.delete(form.getTodoId());
//		} catch (BusinessException e) {
//			model.addAttribute(e.getResultMessages());
//			return list(pageable, model);
//		}
//		ResultMessages messages = ResultMessages.success();
//		messages.add(ResultMessage.fromText("Delete successfully!"));
//		attributes.addFlashAttribute(messages);
//
//		return "redirect:/todo/list";
//	}

}
