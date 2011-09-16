package com.alibaba.sample.petstore.web.servlet;

import static com.alibaba.sample.petstore.web.common.PetstoreConstant.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.sample.petstore.web.common.PetstoreUser;

/**
 * ����򵥵�servlet������ʾ�������ͨ��servlet�з���webx�������request/response/session�ȶ�������Ҫ��webx
 * framework filter�������У�Ϊ���servlet���һ��passthru���ˡ�
 * 
 * @author Michael Zhou
 */
public class GetLoginUser extends HttpServlet {
    private static final long serialVersionUID = 8852358774890544749L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain; charset=UTF-8");

        PrintWriter out = response.getWriter();
        PetstoreUser user = (PetstoreUser) request.getSession().getAttribute(PETSTORE_USER_SESSION_KEY);

        if (user.hasLoggedIn()) {
            out.print(user.getId());
        } else {
            out.print("guest");
        }

        out.flush();
    }
}
