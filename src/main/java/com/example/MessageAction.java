package com.example;


import javax.servlet.http.*;
import org.apache.struts.action.*;
public class MessageAction extends Action{

    public ActionForward execute(ActionMapping mapping,
                             ActionForm form,
                             HttpServletRequest request,
                             HttpServletResponse response){
        request.setAttribute("Message",request.getParameter("message"));
        return mapping.findForward("test");
    }
}
