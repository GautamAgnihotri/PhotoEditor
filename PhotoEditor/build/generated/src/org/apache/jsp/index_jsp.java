package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=dev ice-width, initial-scale=1.0\">\n");
      out.write("\t<title>PHOTO EDITOR</title>\n");
      out.write("\t\n");
      out.write("\t<link rel=\"stylesheet\" href=\"assets/CSS/style.css\">\n");
      out.write("\t<link href='https://unpkg.com/boxicons@2.0.9/css/boxicons.min.css' rel='stylesheet'>\n");
      out.write("   \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<div class=\"main\">\n");
      out.write("\t\t\n");
      out.write("      <div class=\"Tools\">\n");
      out.write("      \t<ul>\n");
      out.write("      \t\t<li>\n");
      out.write("      \t \t\t<i class='bx bxs-brightness-half'></i>\n");
      out.write("      \t\t\t<p>BrightNess</p>\n");
      out.write("      \t\t</li>\n");
      out.write("      \t\t<li>\n");
      out.write("      \t\t\t<i class='bx bxs-brush' ></i>\n");
      out.write("      \t\t\t<p>Blur</p>\n");
      out.write("      \t\t</li>\n");
      out.write("      \t\t<li>\n");
      out.write("      \t\t\t<i class='bx bxs-collection' ></i>\n");
      out.write("      \t\t\t<p>GreyScale</p>\n");
      out.write("      \t\t</li>\n");
      out.write("      \t\t<li>\n");
      out.write("      \t\t\t<i class='bx bxs-color-fill' ></i>\n");
      out.write("      \t\t\t<p>Hue Rotate</p>\n");
      out.write("      \t\t</li>\n");
      out.write("      \t\n");
      out.write("\t\t\t<li>\n");
      out.write("\t\t\t\t<i class='bx bxs-magic-wand' ></i>\n");
      out.write("\t\t\t\t<p>Saturation</p>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<li>\n");
      out.write("\t\t\t\t<i class='bx bx-pencil'></i>\n");
      out.write("\t\t\t\t<p>Draw</p>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<li>\n");
      out.write("\t\t\t\t<i class='bx bx-crop'></i>\n");
      out.write("\t\t\t\t<p>Crop</p>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t\n");
      out.write("      \t\t<li onclick=\"Download_btn()\">\n");
      out.write("      \t\t\t<i class='bx bx-export' ></i>\n");
      out.write("      \t\t\t<p>Export</p>\n");
      out.write("      \t\t</li>\n");
      out.write("      \t</ul>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"content\">\n");
      out.write("      \t\n");
      out.write("\t\t<p id=\"logo\"><i class='bx bx-ghost'></i>Photo Editor</p>\n");
      out.write("\n");
      out.write("      \t<div  class=\"choose_image\">\n");
      out.write("      \t\t<div class=\"upload_img_box\">\n");
      out.write("      \t\t\t<i class='bx bxs-image-add' ></i><br>\n");
      out.write("      \t\t\t<input type=\"file\" name=\"selectedImage\" id=\"selectedImage\" accept=\"image/jpeg, image/png\">\n");
      out.write("      \t\t\t<p id=\"hint\">choose Image from folder </p>\n");
      out.write("      \t\t</div>\n");
      out.write("      \t</div>\n");
      out.write("\n");
      out.write("      \t<canvas id=\"image_canvas\"></canvas>\n");
      out.write("        \n");
      out.write("        <div class=\"image_holder\">\n");
      out.write("        \t<button id=\"remove_img_btn\"><i class='bx bxs-message-square-x' ></i></button>\n");
      out.write("        \t<img src=\"\" alt=\"img\" id=\"image\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"options\">\n");
      out.write("        \t\n");
      out.write("          <div class=\"option\">\n");
      out.write("          \t<input type=\"range\" max=\"200\" min=\"0\" value=\"100\" id=\"brightness\" class=\"slider\">\n");
      out.write("          \t<p id=\"brightVal\" class=\"show_value\">100</p>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("           <div class=\"option\">\n");
      out.write("          \t<input type=\"range\" max=\"40\" min=\"0\" value=\"0\" id=\"blur\" class=\"slider\">\n");
      out.write("          \t<p id=\"blurVal\" class=\"show_value\">0</p>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("           <div class=\"option\">\n");
      out.write("          \t<input type=\"range\" max=\"100\" min=\"0\" value=\"0\" id=\"greyScale\" class=\"slider\">\n");
      out.write("          \t<p id=\"greyVal\" class=\"show_value\">0</p>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("           <div class=\"option\">\n");
      out.write("          \t<input type=\"range\" max=\"100\" min=\"0\" value=\"0\" id=\"hue\" class=\"slider\">\n");
      out.write("          \t<p id=\"hueVal\" class=\"show_value\">0</p>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("           <div class=\"option\">\n");
      out.write("          \t<input type=\"range\" max=\"100\" min=\"1\" value=\"1\" id=\"saturation\" class=\"slider\">\n");
      out.write("          \t<p id=\"saturationVal\" class=\"show_value\">1</p>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("\t\t  <div class=\"option\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<span class=\"dTool \" id=\"pencil\"><i class='bx bxs-pencil bx-lg' ></i></span>\n");
      out.write("\t\t\t<span class=\"dTool\" id=\"paint\"><i class='bx bx-paint bx-lg'></i></span>\n");
      out.write("\t\t\t<span class=\"dTool\" id=\"spray\"><i class='bx bx-spray-can bx-lg'></i></span>\n");
      out.write("\t\t\t<span class=\"dTool\" id=\"shape\"><i class='bx bxs-shapes'></i></span>\n");
      out.write("\t\t\t<span class=\"dTool\" id=\"color\"><input type=\"color\" name=\"colorchooser\" ></span>\n");
      out.write("\t\t\t<span class=\"dTool\"><input type=\"range\" max=\"100\" min=\"1\" value=\"1\" id=\"brushSize\" class=\"slider\"></span>\n");
      out.write("\t\t\n");
      out.write("\t\t  </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <button id=\"clearAll\"><span>Reset</span><i class='bx bx-reset' ></i></button>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t <script src=\"assets/js/indexScript.js\"></script>\n");
      out.write("\t\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
