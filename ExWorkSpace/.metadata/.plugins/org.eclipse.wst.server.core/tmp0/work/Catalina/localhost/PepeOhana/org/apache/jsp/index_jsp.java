/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.7
 * Generated at: 2023-09-06 06:53:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import model.UsersInfoDto;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("model.UsersInfoDto");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPではGET、POST、またはHEADのみが許可されます。 JasperはOPTIONSも許可しています。");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"ja\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM\" crossorigin=\"anonymous\">\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <title>Top | pepeohana</title>\n");
      out.write("</head>\n");
      out.write("\n");

    // セッションを取得
	UsersInfoDto userInfoOnSession = (UsersInfoDto)session.getAttribute("LOGIN_INFO"); 
	boolean isLoggedIn = false; 
	String userName = "";
	//HttpSession mysession = request.getSession(true);

    // セッションが存在し、username属性もセットされている場合はログイン済み
    if (userInfoOnSession != null) {
		userName = userInfoOnSession.getUserName();	
        isLoggedIn = true;
    }

      out.write("\n");
      out.write("\n");
      out.write("<body  style=\"background-color:beige;\">\n");
      out.write("	");
 if (isLoggedIn) { 
      out.write("\n");
      out.write("    <!-- ログイン済ヘッダー -->\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light bg-white\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"index.jsp\">\n");
      out.write("                <img src=\"images/pepe_ohana_logo.png\" alt=\"ページロゴ\" width=\"auto\" height=\"70\">\n");
      out.write("            </a>\n");
      out.write("            <div class=\"btn-group\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-secondary dropdown-toggle\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                    userName\n");
      out.write("                </button>\n");
      out.write("                <ul class=\"dropdown-menu dropdown-menu-end\">\n");
      out.write("                    <li><a class=\"dropdown-item\" href=\"");
      out.print(request.getContextPath());
      out.write("/ExeMyPage\">マイページ</a></li>\n");
      out.write("                    <li><a class=\"dropdown-item\" href=\"");
      out.print(request.getContextPath());
      out.write("/ExeLogout\">ログアウト</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    <!-- ログイン済ヘッダーここまで -->\n");
      out.write("    ");
 } else { 
      out.write("\n");
      out.write("    <!-- 未ログインヘッダー -->\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light bg-white\">\n");
      out.write("    	<div class=\"container-fluid\">\n");
      out.write("        	<a class=\"navbar-brand\" href=\"index.jsp\">\n");
      out.write("          		<img src=\"images/pepe_ohana_logo.png\" alt=\"ページロゴ\" width=\"auto\" height=\"70\">\n");
      out.write("          	</a>\n");
      out.write("         	<div class=\"btn-group\">\n");
      out.write("            	<button type=\"button\" class=\"btn btn-outline-secondary dropdown-toggle\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("             		 未ログイン\n");
      out.write("            	</button>\n");
      out.write("            	<ul class=\"dropdown-menu dropdown-menu-end\">\n");
      out.write("              		<li><a class=\"dropdown-item\" href=\"jsp/Login.jsp\">ログイン</a></li>\n");
      out.write("              		<li><a class=\"dropdown-item\" href=\"jsp/registUser.jsp\">新規ユーザー登録</a></li>\n");
      out.write("            	</ul>\n");
      out.write("          	</div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    <!-- 未ログインヘッダーここまで -->\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- ヒーロー画像 -->\n");
      out.write("    <img class=\"img-fluid mb-4\" src=\"images/hero_index.jpg\"  alt=\"index画像\" style=\"max-height:500px; width:100%; object-fit: cover;\">\n");
      out.write("\n");
      out.write("    <!-- ここから下　ページごとの内容 -->\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"h4 pb-2 mb-4 text-black border-bottom border-black\">\n");
      out.write("            ねこまっちんぐ\n");
      out.write("        </div>\n");
      out.write("            <p>家族をさがしているネコがたくさんいます！</p>\n");
      out.write("        <!-- 猫カードエリア -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("           <!-- カードのコンテンツ1 -->\n");
      out.write("           <div class=\"col-6 col-md-4 col-lg-3\">\n");
      out.write("                <div class=\"card mb-3\">\n");
      out.write("                	<img src=\"images/cat_2.jpg\" style=\"height:180px; width: 100%; object-fit: cover;\" class=\"card-img-top\" alt=\"猫画像\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h5 class=\"card-title text-center border-bottom pb-2\">pepe<small> ちゃん</small></h5>\n");
      out.write("                        <p class=\"card-text text-right\">描種 : アメリカンショートヘアー</p>\n");
      out.write("                        <p class=\"card-text text-right\">年齢 : 1歳2ヵ月</p>\n");
      out.write("                        <p class=\"card-text text-right\">性別 : 男の子</p>\n");
      out.write("                        <div class=\"d-flex justify-content-center\">\n");
      out.write("                            <a href=\"#\" class=\"stretched-link\"></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           <!-- カードのコンテンツ2 -->\n");
      out.write("           <div class=\"col-6 col-md-4 col-lg-3\">\n");
      out.write("                <div class=\"card mb-3\">\n");
      out.write("                	<img src=\"images/cat_2.jpg\" style=\"height:180px; width: 100%; object-fit: cover;\" class=\"card-img-top\" alt=\"猫画像\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h5 class=\"card-title text-center border-bottom pb-2\">pepe<small> ちゃん</small></h5>\n");
      out.write("                        <p class=\"card-text text-right\">描種 : アメリカンショートヘアー</p>\n");
      out.write("                        <p class=\"card-text text-right\">年齢 : 1歳2ヵ月</p>\n");
      out.write("                        <p class=\"card-text text-right\">性別 : 男の子</p>\n");
      out.write("                        <div class=\"d-flex justify-content-center\">\n");
      out.write("                            <a href=\"#\" class=\"stretched-link\"></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           <!-- カードのコンテンツ3 -->\n");
      out.write("           <div class=\"col-6 col-md-4 col-lg-3\">\n");
      out.write("                <div class=\"card mb-3\">\n");
      out.write("                	<img src=\"images/cat_2.jpg\" style=\"height:180px; width: 100%; object-fit: cover;\" class=\"card-img-top\" alt=\"猫画像\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h5 class=\"card-title text-center border-bottom pb-2\">pepe<small> ちゃん</small></h5>\n");
      out.write("                        <p class=\"card-text text-right\">描種 : アメリカンショートヘアー</p>\n");
      out.write("                        <p class=\"card-text text-right\">年齢 : 1歳2ヵ月</p>\n");
      out.write("                        <p class=\"card-text text-right\">性別 : 男の子</p>\n");
      out.write("                        <div class=\"d-flex justify-content-center\">\n");
      out.write("                            <a href=\"#\" class=\"stretched-link\"></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           <!-- カードのコンテンツ4 -->\n");
      out.write("           <div class=\"col-6 col-md-4 col-lg-3\">\n");
      out.write("                <div class=\"card mb-3\">\n");
      out.write("                	<img src=\"images/cat_2.jpg\" style=\"height:180px; width: 100%; object-fit: cover;\" class=\"card-img-top\" alt=\"猫画像\">\n");
      out.write("                     <div class=\"card-body\">\n");
      out.write("                         <h5 class=\"card-title text-center border-bottom pb-2\">pepe<small> ちゃん</small></h5>\n");
      out.write("                         <p class=\"card-text text-right\">描種 : アメリカンショートヘアー</p>\n");
      out.write("                         <p class=\"card-text text-right\">年齢 : 1歳2ヵ月</p>\n");
      out.write("                         <p class=\"card-text text-right\">性別 : 男の子</p>\n");
      out.write("                         <div class=\"d-flex justify-content-center\">\n");
      out.write("                             <a href=\"#\" class=\"stretched-link\"></a>\n");
      out.write("                         </div>\n");
      out.write("                     </div>\n");
      out.write("                 </div>\n");
      out.write("            </div>\n");
      out.write("		</div>\n");
      out.write("             \n");
      out.write("        <!-- 検索フォームエリア -->\n");
      out.write("        <div class=\"card mt-3 p-3\">\n");
      out.write("         	<form action=\"SearchCat\">\n");
      out.write("         		<h3 class=\"border-bottom pb-2\" style=\"text-align:center;\">まっちんぐ</h3>\n");
      out.write("         		<div class=\"form-check mt-3\">\n");
      out.write("					<label for=\"\" class=\"form-label\">性別を選んでください(複数選択可)<span class=\"text-danger\">　※必須</span></label><br>\n");
      out.write("	         		<input type=\"checkbox\" class=\"btn-check\" id=\"gender_1\" value=\"1\" autocomplete=\"off\">\n");
      out.write("					<label class=\"btn btn-outline-secondary\" for=\"gender_1\">男の子</label>\n");
      out.write("	         		<input type=\"checkbox\" class=\"btn-check\" id=\"gender_2\" value=\"2\" autocomplete=\"off\">\n");
      out.write("					<label class=\"btn btn-outline-secondary ms-3\" for=\"gender_2\">女の子</label>\n");
      out.write("				</div>\n");
      out.write("         		<div class=\"form-check mt-3\">\n");
      out.write("					<label for=\"\" class=\"form-label\">年齢を選んでください(複数選択可)<span class=\"text-danger\">　※必須</span></label><br>\n");
      out.write("	         		<input type=\"checkbox\" class=\"btn-check\" id=\"age_1\" value=\"1\" autocomplete=\"off\">\n");
      out.write("					<label class=\"btn btn-outline-secondary\" for=\"age_1\">～1歳未満</label>\n");
      out.write("	         		<input type=\"checkbox\" class=\"btn-check\" id=\"age_2\" value=\"2\" autocomplete=\"off\">\n");
      out.write("					<label class=\"btn btn-outline-secondary ms-3\" for=\"age_2\">1歳～3歳未満</label>\n");
      out.write("	         		<input type=\"checkbox\" class=\"btn-check\" id=\"age_3\" value=\"3\" autocomplete=\"off\">\n");
      out.write("					<label class=\"btn btn-outline-secondary ms-3\" for=\"age_3\">3歳～</label>\n");
      out.write("				</div>\n");
      out.write("				<p style=\"text-align:center; margin-bottom:0;\">\n");
      out.write("					<button type=\"submit\" class=\"btn btn-success btn-lg mt-4\">まっちんぐ</button>\n");
      out.write("				</p>\n");
      out.write("			</form>\n");
      out.write("		</div>\n");
      out.write("		\n");
      out.write("	</div>\n");
      out.write("    <!-- ここまで　ページごとの内容 -->\n");
      out.write("\n");
      out.write("    <!-- フッター -->\n");
      out.write("    <div class=\"text-center mt-4\">\n");
      out.write("        <a class=\"icon-link icon-link-hover\" href=\"#\">\n");
      out.write("            ページトップへ\n");
      out.write("        </a>\n");
      out.write("	</div>\n");
      out.write("	<footer class=\"d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top\">\n");
      out.write("    	<div class=\"col-md-4 d-flex align-items-center ms-3\">\n");
      out.write("        	<a href=\"index.jsp\" class=\"mb-3 me-2 mb-md-0\"><img alt=\"ロゴ画像\" src=\"images/nikukyu_logo.png\" width=\"auto\" height=\"40\"></a>\n");
      out.write("          	<span class=\"mb-3 mb-md-0 text-body-secondary\">© 2023 pepeohana, Inc</span>\n");
      out.write("        </div>\n");
      out.write("        <ul class=\"nav col-md-4 justify-content-end list-unstyled d-flex me-3\">\n");
      out.write("            <li><a href=\"#\"><img src=images/twitter_logo.png width=\"auto\" height=\"25\"></a></li>\n");
      out.write("            <li class=\"ms-4\"><a href=\"#\"><img src=images/insta_logo.png width=\"auto\" height=\"25\"></a></li>\n");
      out.write("            <li class=\"ms-4\"><a href=\"#\"><img src=images/facebook_logo.png width=\"auto\" height=\"25\"></a></li>\n");
      out.write("        </ul>\n");
      out.write("	</footer>\n");
      out.write("    <!-- フッター　ここまで -->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
