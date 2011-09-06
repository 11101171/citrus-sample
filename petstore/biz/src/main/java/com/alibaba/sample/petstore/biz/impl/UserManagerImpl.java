package com.alibaba.sample.petstore.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.sample.petstore.biz.DuplicatedUserException;
import com.alibaba.sample.petstore.biz.UserManager;
import com.alibaba.sample.petstore.dal.dao.UserDao;
import com.alibaba.sample.petstore.dal.dataobject.User;

/**
 * �й��û��Ĳ�����
 * 
 * @author Michael Zhou
 */
public class UserManagerImpl implements UserManager {
    @Autowired
    private UserDao userDao;

    /**
     * ��¼�û�������û�����������ȷ���򷵻���Ӧ���û���Ϣ��
     * 
     * @param userId �û���
     * @param password ����
     * @return �û���Ϣ������û��������벻��ȷ���򷵻�<code>null</code>
     */
    public User login(String userId, String password) {
        return userDao.getAuthenticatedUser(userId, password);
    }

    /**
     * ע���û���
     * 
     * @param user �û�����
     * @return �µ��û���Ϣ
     */
    public void register(User user) throws DuplicatedUserException {
        User dupuser = userDao.getUserById(user.getUserId());

        if (dupuser != null) {
            throw new DuplicatedUserException("duplicated user: " + user.getUserId());
        }

        userDao.insertUser(user);
    }

    /**
     * �����û�����Ϣ��
     * 
     * @param user �û�����
     * @return �µ��û���Ϣ
     */
    public void update(User user) {
        userDao.updateUser(user);
    }

    /**
     * ȡ��ָ��id���û���
     * 
     * @param userId �û�id
     * @return ָ��id���û�
     */
    public User getUser(String userId) {
        return userDao.getUserById(userId);
    }
}
