package jp.co.smartservice.app.todo;

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
import org.terasoluna.gfw.common.message.ResultMessage;
import org.terasoluna.gfw.common.message.ResultMessages;

import jp.co.smartservice.app.todo.TodoForm.TodoCreate;
import jp.co.smartservice.app.todo.TodoForm.TodoDelete;
import jp.co.smartservice.app.todo.TodoForm.TodoFinish;
import jp.co.smartservice.domain.model.Todo;
import jp.co.smartservice.domain.model.TodoExample;
import jp.co.smartservice.domain.service.todo.TodoService;

@Controller
@RequestMapping("todo")
public class TodoController {

    @Inject
    Mapper beanMapper;

    @Inject
	TodoService todoService;

	@ModelAttribute("todoForm")
	public TodoForm setUpTodoForm() {
		TodoForm form = new TodoForm();
		return form;
	}

/*
	@RequestMapping(value = "list")
	public String list(Model model) {
		Collection<Todo> todoList = todoService.findAll();
		model.addAttribute("todoList", todoList);
		return "todo/list";
	}
*/
	@RequestMapping(value = "list")
	public String list(@PageableDefault(10) Pageable pageable, Model model) {
		TodoExample example = new TodoExample();
		example.setOrderByClause("created_at DESC");
		Page<Todo> page = todoService.findPage(example, pageable);
		model.addAttribute("page", page);
		return "todo/list";
	}

	@RequestMapping(value = "list", method = RequestMethod.POST, params= "create")
	public String create(@Validated({Default.class, TodoCreate.class}) TodoForm form,
			BindingResult bingdingResult, @PageableDefault(10) Pageable pageable,
			Model model, RedirectAttributes attributes) {

		if (bingdingResult.hasErrors()) {
			return list(pageable, model);
		}
		Todo todo = beanMapper.map(form, Todo.class);

        try {
            todoService.create(todo);
        } catch (BusinessException e) {
            model.addAttribute(e.getResultMessages());
            return list(pageable, model);
        }

        ResultMessages messages = ResultMessages.success();
        messages.add(ResultMessage.fromText("Created successfully!"));
        attributes.addFlashAttribute(messages);

		return "redirect:/todo/list";
	}

	@RequestMapping(value = "list", method = RequestMethod.POST, params= "finish")
	public String finish(@Validated({Default.class, TodoFinish.class}) TodoForm form,
			BindingResult bindingResult, @PageableDefault(10) Pageable pageable,
			Model model, RedirectAttributes attributes) {

		if (bindingResult.hasErrors()) {
			return list(pageable, model);
		}

		try{
			todoService.finish(form.getTodoId());
		} catch (BusinessException e) {
			model.addAttribute(e.getResultMessages());
			return list(pageable, model);
		}

		ResultMessages messages = ResultMessages.success();
		messages.add(ResultMessage.fromText("Finished successfully!"));
		attributes.addFlashAttribute(messages);

		return "redirect:/todo/list";
	}

	@RequestMapping(value = "list", method = RequestMethod.POST, params="delete")
	public String delete(@Validated({Default.class, TodoDelete.class}) TodoForm form,
			BindingResult bindingResult, @PageableDefault(10) Pageable pageable,
			Model model, RedirectAttributes attributes) {

		if (bindingResult.hasErrors()) {
			return list(pageable, model);
		}
		try{
			todoService.delete(form.getTodoId());
		} catch (BusinessException e) {
			model.addAttribute(e.getResultMessages());
			return list(pageable, model);
		}
		ResultMessages messages = ResultMessages.success();
		messages.add(ResultMessage.fromText("Delete successfully!"));
		attributes.addFlashAttribute(messages);

		return "redirect:/todo/list";
	}

}
