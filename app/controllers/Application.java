package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Index;
import views.html.kelly;
import views.html.bethany;
import views.html.jake;

/**
 * Implements the controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page. 
   * @return The resulting home page. 
   */
  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }
  
  /**
   * @return Kelly Slater's page.
   */
  public static Result kelly() {
    return ok(kelly.render("Welcome to Page1."));
    
  }
  
  /**
   * @return Bethany Hamilton's page.
   */
  public static Result bethany() {
    return ok(bethany.render("Welcome to Page1."));
    
  }
  
  /**
   * @return Jake Marshall's page.
   */
  public static Result jake() {
    return ok(jake.render("Welcome to Page1."));
    
  }
}
