package org.codehaus.grails.portlets.container.liferay;

import javax.portlet.PortletConfig
import javax.portlet.PortletContext
import javax.portlet.PortletRequest
import javax.portlet.PortletResponse
import javax.servlet.ServletConfig
import javax.servlet.ServletContext
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

import org.codehaus.grails.portlets.container.AbstractPortletContainerAdapter
import org.springframework.web.portlet.context.PortletApplicationContextUtils

/**
 * Accommodates Liferay container specific operations.
 *
 * @author Kenji Nakamura
 * @since 0.2
 */
class LiferayPortletContainerAdapter extends AbstractPortletContainerAdapter {

	ServletContext getServletContext(PortletContext context) {
		PortletApplicationContextUtils.getWebApplicationContext(context).servletContext
	}

	ServletConfig getServletConfig(PortletConfig config) {
		throw new UnsupportedOperationException("Liferay doesn't wrap ServletConfig in PortletConfigImpl.")
	}

	HttpServletRequest getHttpServletRequest(PortletRequest portletRequest) {
		portletRequest.httpServletRequest
   }

   HttpServletResponse getHttpServletResponse(PortletResponse portletResponse) {
      portletResponse.httpServletResponse
   }
}
