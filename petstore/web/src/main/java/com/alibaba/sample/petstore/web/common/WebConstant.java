package com.alibaba.sample.petstore.web.common;

/**
 * Petstore WEB��ĳ�����
 * 
 * @author Michael Zhou
 */
public interface WebConstant {
    /** Petstoreǰ̨��ACL realm�� */
    String ACCESS_STORE_REALM = "store";

    /** Petstore��̨��ACL realm�� */
    String ACCESS_ADMIN_REALM = "admin";

    /** ��session�б���petstore�û������key�� */
    String PETSTORE_USER_SESSION_KEY = "petstoreUser";

    /** ��session�б���shopping cart�����key�� */
    String PETSTORE_CART_KEY = "petstoreCart";

    /** Loginҳ�淵��URL��key�� */
    String LOGIN_RETURN_KEY = "return";

    /** ���δָ��return����¼�Ժ��������URL�� */
    String LOGIN_RETURN_DEFAULT_LINK = "petstoreHomeLink";

    /** ��¼URL�����֡� */
    String PETSTORE_LOGIN_LINK = "petstoreLoginLink";

    /** �Ǽ��û�URL�����֡� */
    String PETSTORE_REGISTER_LINK = "petstoreRegisterLink";

    /** �Ǽ��û���ϢURL�����֡� */
    String PETSTORE_REGISTER_ACCOUNT_LINK = "petstoreRegisterAccountLink";

    /** �鿴�û���ϢURL�����֡� */
    String PETSTORE_ACCOUNT_LINK = "petstoreAccountLink";
}
