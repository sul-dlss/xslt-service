package edu.stanford.sulair.dlss.lyberstructure;


import org.apache.log4j.PropertyConfigurator;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Log4jInit extends HttpServlet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public
  void init() {
    String prefix =  getServletContext().getRealPath("/");
    String file = getInitParameter("log4j-init-file");
    // if the log4j-init-file is not set, then no point in trying
    if(file != null) {
      PropertyConfigurator.configure(prefix+file);
    }
  }

  public
  void doGet(HttpServletRequest req, HttpServletResponse res) {
  }
}

