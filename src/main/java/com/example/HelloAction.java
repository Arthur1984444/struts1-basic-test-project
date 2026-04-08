package com.example;

import javax.servlet.http.*;
import org.apache.struts.action.*;

public class HelloAction extends Action {
    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) {

        request.setAttribute("message", "Bonjour depuis Struts !");
        return mapping.findForward("success");
    }
}