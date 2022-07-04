package cg.m3.furama.util;

import javax.servlet.ServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class PagingTag extends TagSupport {
    private String name;
    private Object search;
    private Object params;

    public void setName(String name) {
        this.name = name;
    }

    public void setSearch(Object search){
        this.search= search;
    }

    public void setParams(Object params) {
        this.params = params;
    }

    @Override
    public int doStartTag() throws JspException {
        try {
            ServletRequest request= pageContext.getRequest();
            request.setAttribute("name", name);
            request.setAttribute("search", search);
            request.setAttribute("result", params);
            pageContext.include("/layout/paging.jsp");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return SKIP_BODY;
    }
}
