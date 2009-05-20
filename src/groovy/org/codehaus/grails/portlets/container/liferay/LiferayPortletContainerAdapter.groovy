package org.codehaus.grails.portlets.container.liferay

import org.codehaus.grails.portlets.container.AbstractPortletContainerAdapter
import javax.servlet.ServletContext
import javax.portlet.PortletContext
import javax.servlet.ServletConfig
import javax.portlet.PortletConfig
import javax.servlet.http.HttpServletRequest
import javax.portlet.PortletRequest
import javax.servlet.http.HttpServletResponse
import javax.portlet.PortletResponse

/**
 * Accommodates Liferay container specific operations.
 *
 * @author Kenji Nakamura 
 * @since 0.2
 */

public class LiferayPortletContainerAdapter extends AbstractPortletContainerAdapter {

    public ServletContext getServletContext(PortletContext context) {
        return context.servletContext
    }

    public ServletConfig getServletConfig(PortletConfig config) {
        throw new UnsupportedOperationException("Liferay doesn't wrap ServletConfig in PortletConfigImpl.")
    }

    public HttpServletRequest getHttpServletRequest(PortletRequest portletRequest) {
        return portletRequest.originalHttpServletRequest
    }

    public HttpServletResponse getHttpServletResponse(PortletResponse portletResponse) {
        return portletResponse.httpServletResponse
    }


}
