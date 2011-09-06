package com.alibaba.sample.petstore.biz;

import com.alibaba.sample.petstore.dal.dataobject.User;

/**
 * �й��û��Ĳ�����
 * 
 * @author Michael Zhou
 */
public interface UserManager {
    /**
     * ��¼�û�������û�����������ȷ���򷵻���Ӧ���û���Ϣ��
     * 
     * @param userId �û���
     * @param password ����
     * @return �û���Ϣ������û��������벻��ȷ���򷵻�<code>null</code>
     */
    User login(String userId, String password);

    /**
     * ע���û���
     * 
     * @param user �û�����
     */
    void register(User user) throws DuplicatedUserException;

    /**
     * �����û�����Ϣ��
     * 
     * @param user �û�����
     */
    void update(User user);

    /**
     * ȡ��ָ��id���û���
     * 
     * @param userId �û�id
     * @return ָ��id���û�
     */
    User getUser(String userId);
}
