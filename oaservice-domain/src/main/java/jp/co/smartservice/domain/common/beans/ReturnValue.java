/*
 * Copyright (C) 2009-2015 Smart Service
 *
 */
package jp.co.smartservice.domain.common.beans;

import java.io.Serializable;

import org.terasoluna.gfw.common.message.ResultMessages;

/**
 * ビジネスロジック出力情報クラス。
 *
 * @author Smart Service
 *
 */
public class ReturnValue<T> implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 2712179136429367772L;

    /**
     * ビジネスロジック内で生成されるメッセージ。
     */
    private ResultMessages resultMessages;

    /**
     * ビジネスロジックの実行結果を格納したJavaBean。
     */
    private T resultObject;

    /**
     * ビジネスロジック内で生成されたメッセージを取得する。
     *
     * @return ビジネスロジック内で生成されたメッセージ
     */
    public ResultMessages getResultMessages() {
        return this.resultMessages;
    }

    /**
     * ビジネスロジック内で生成されたメッセージを設定する。
     *
     * @param paramMessages
     *            ビジネスロジック内で生成されたメッセージ
     */
    public void setResultMessages(ResultMessages resultMessages) {
        this.resultMessages = resultMessages;
    }

    /**
     * ビジネスロジックの実行結果を格納したJavaBeanを取得する。
     *
     * @return ビジネスロジックの実行結果を格納したJavaBean
     */
    public T getResultObject() {
        return resultObject;
    }

    /**
     * ビジネスロジックの実行結果を格納したJavaBeanを設定する。
     *
     * @param resultObject ビジネスロジックの実行結果を格納したJavaBean
     */
    public void setResultObject(T resultObject) {
        this.resultObject = resultObject;
    }

}
