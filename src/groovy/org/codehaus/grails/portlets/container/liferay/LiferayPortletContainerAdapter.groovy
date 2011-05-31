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
import org.codehaus.groovy.grails.commons.spring.GrailsWebApplicationContext

/**
 * Accommodates Liferay container specific operations.
 *
 * @author Kenji Nakamura
 * @since 0.2
 */
public class LiferayPortletContainerAdapter extends AbstractPortletContainerAdapter {

   public ServletContext getServletContext(PortletContext context) {
      GrailsWebApplicationContext gwac = (GrailsWebApplicationContext)PortletApplicationContextUtils.getWebApplicationContext(context)
      return gwac.getServletContext()
   }

   public ServletConfig getServletConfig(PortletConfig config) {
      throw new UnsupportedOperationException("Liferay doesn't wrap ServletConfig in PortletConfigImpl.");
   }

   public HttpServletRequest getHttpServletRequest(PortletRequest portletRequest) throws UnsupportedOperationException {
      return portletRequest.getHttpServletRequest();
   }

   public HttpServletResponse getHttpServletResponse(PortletResponse portletResponse) throws UnsupportedOperationException {
      return portletResponse.getHttpServletResponse();
   }
}
