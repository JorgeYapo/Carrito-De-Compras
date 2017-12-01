package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');

    String usu="";
    String nom="";
    HttpSession sesionOK=request.getSession();
    
if(sesionOK.getAttribute("perfil")!=null)
    nom=(String)sesionOK.getAttribute("nom")+" "+(String)sesionOK.getAttribute("ape");
    
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body><table border=\"0\" width=\"1000\" align=\"center\">\n");
      out.write("            <tr bgcolor=\"skyblue\">\n");
      out.write("                <th align=\"left\"><a href=\"index.jsp\">Catálogo</a></th>\n");
      out.write("                ");

                        if(sesionOK.getAttribute("perfil")!=null && sesionOK.getAttribute("perfil").equals("Admin")){
                    
      out.write("\n");
      out.write("                <th><a href=\"registrarProducto.jsp\">Registrar Producto</a></th>\n");
      out.write("                ");

                    }
                        if(sesionOK.getAttribute("perfil")!=null){
                    
      out.write("\n");
      out.write("                <th><a href=\"registrarVenta.jsp\">Registrar ventas</a></th>\n");
      out.write("                ");

                    }
                        if(sesionOK.getAttribute("perfil")!=null && sesionOK.getAttribute("perfil").equals("Admin")){
                    
      out.write("\n");
      out.write("                <th><a href=\"ServletControlador?accion=MostrarVentas\">Consultar Ventas</a></th>\n");
      out.write("                ");

                    }

if(sesionOK.getAttribute("perfil")!=null){
                    
      out.write("\n");
      out.write("                <th><a href=\"ServletLogueo?accion=cerrar\">Cerrar Sesión</a></th>\n");
      out.write("                <th width=\"200\">");
out.println("Bienvenido : "+nom);
      out.write("\n");
      out.write("                </th>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("                \n");
      out.write("                ");

               if(sesionOK.getAttribute("perfil")==null){
               
      out.write("\n");
      out.write("                <th width=\"200\"><a href=\"login.jsp\">Iniciar Sesion</a></th>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <h2 align=\"center\">Logueo de Usuarios</h2>\n");
      out.write("        <table border=\"0\" width=\"300\" align=\"Center\">\n");
      out.write("        <form action=\"ServletLogueo\" method=\"post\">\n");
      out.write("           <input type=\"hidden\" name=\"accion\" value=\"loguin\"/>\n");
      out.write("           <tr>\n");
      out.write("               <td>Usuario:</td>\n");
      out.write("               <td><input type=\"text\" placeholder=\"Usuario\" name=\"txtUsu\"></td>\n");
      out.write("           </tr>\n");
      out.write("            <tr>\n");
      out.write("               <td>Passoword:</td>\n");
      out.write("               <td> <input type=\"password\" placeholder=\"Password\" name=\"txtPas\"></td>\n");
      out.write("           </tr>                  \n");
      out.write("           <tr>\n");
      out.write("               <th colspan=\"2\">\n");
      out.write("                 <input type=\"submit\" name=\"btn\" value=\"Iniciar Sesion\"> \n");
      out.write("               </th>\n");
      out.write("           </tr> \n");
      out.write("           </form>\n");
      out.write("        </table>\n");
      out.write("        <h4 align=\"center\">\n");
      out.write("             ");

              if(request.getAttribute("msg")!=null)
                 out.println(request.getAttribute("msg"));
             
      out.write("\n");
      out.write("       </h4>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
