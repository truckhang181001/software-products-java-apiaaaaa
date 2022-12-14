// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:23
  Assets_1: controllers.Assets,
  // @LINE:25
  SoftwareController_2: controllers.SoftwareController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:23
    Assets_1: controllers.Assets,
    // @LINE:25
    SoftwareController_2: controllers.SoftwareController
  ) = this(errorHandler, HomeController_0, Assets_1, SoftwareController_2, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, SoftwareController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """computers""", """controllers.HomeController.list(request:Request, p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """computers/new""", """controllers.HomeController.create(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """computers""", """controllers.HomeController.save(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """computers/""" + "$" + """id<[^/]+>""", """controllers.HomeController.edit(request:Request, id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """computers/""" + "$" + """id<[^/]+>""", """controllers.HomeController.update(request:Request, id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """computers/""" + "$" + """id<[^/]+>/delete""", """controllers.HomeController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/client/software/detail""", """controllers.SoftwareController.getDetailSoftware(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/client/software/list""", """controllers.SoftwareController.getDetailSoftware(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/client/software/all""", """controllers.SoftwareController.getDetailSoftware(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/client/software/create""", """controllers.SoftwareController.createSoftware(request:Request)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/client/software/update""", """controllers.SoftwareController.getDetailSoftware(request:Request)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/client/software/delete""", """controllers.SoftwareController.getDetailSoftware(request:Request)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Default path will just redirect to the computer list""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_list1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("computers")))
  )
  private[this] lazy val controllers_HomeController_list1_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_0.list(fakeValue[play.mvc.Http.Request], fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "list",
      Seq(classOf[play.mvc.Http.Request], classOf[Int], classOf[String], classOf[String], classOf[String]),
      "GET",
      this.prefix + """computers""",
      """ Computers list (look at the default values for pagination parameters)""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_create2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("computers/new")))
  )
  private[this] lazy val controllers_HomeController_create2_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_0.create(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "create",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """computers/new""",
      """ Add computer""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_save3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("computers")))
  )
  private[this] lazy val controllers_HomeController_save3_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_0.save(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "save",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """computers""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_edit4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("computers/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_edit4_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_0.edit(fakeValue[play.mvc.Http.Request], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "edit",
      Seq(classOf[play.mvc.Http.Request], classOf[Long]),
      "GET",
      this.prefix + """computers/""" + "$" + """id<[^/]+>""",
      """ Edit existing computer""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_update5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("computers/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_update5_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_0.update(fakeValue[play.mvc.Http.Request], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "update",
      Seq(classOf[play.mvc.Http.Request], classOf[Long]),
      "POST",
      this.prefix + """computers/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_delete6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("computers/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_HomeController_delete6_invoker = createInvoker(
    HomeController_0.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "delete",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """computers/""" + "$" + """id<[^/]+>/delete""",
      """ Delete a computer""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Assets_at7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at7_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_SoftwareController_getDetailSoftware8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/client/software/detail")))
  )
  private[this] lazy val controllers_SoftwareController_getDetailSoftware8_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      SoftwareController_2.getDetailSoftware(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SoftwareController",
      "getDetailSoftware",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """api/client/software/detail""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_SoftwareController_getDetailSoftware9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/client/software/list")))
  )
  private[this] lazy val controllers_SoftwareController_getDetailSoftware9_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      SoftwareController_2.getDetailSoftware(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SoftwareController",
      "getDetailSoftware",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """api/client/software/list""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_SoftwareController_getDetailSoftware10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/client/software/all")))
  )
  private[this] lazy val controllers_SoftwareController_getDetailSoftware10_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      SoftwareController_2.getDetailSoftware(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SoftwareController",
      "getDetailSoftware",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """api/client/software/all""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_SoftwareController_createSoftware11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/client/software/create")))
  )
  private[this] lazy val controllers_SoftwareController_createSoftware11_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      SoftwareController_2.createSoftware(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SoftwareController",
      "createSoftware",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """api/client/software/create""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_SoftwareController_getDetailSoftware12_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/client/software/update")))
  )
  private[this] lazy val controllers_SoftwareController_getDetailSoftware12_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      SoftwareController_2.getDetailSoftware(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SoftwareController",
      "getDetailSoftware",
      Seq(classOf[play.mvc.Http.Request]),
      "PUT",
      this.prefix + """api/client/software/update""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_SoftwareController_getDetailSoftware13_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/client/software/delete")))
  )
  private[this] lazy val controllers_SoftwareController_getDetailSoftware13_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      SoftwareController_2.getDetailSoftware(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SoftwareController",
      "getDetailSoftware",
      Seq(classOf[play.mvc.Http.Request]),
      "DELETE",
      this.prefix + """api/client/software/delete""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index())
      }
  
    // @LINE:9
    case controllers_HomeController_list1_route(params@_) =>
      call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        controllers_HomeController_list1_invoker.call(
          req => HomeController_0.list(req, p, s, o, f))
      }
  
    // @LINE:12
    case controllers_HomeController_create2_route(params@_) =>
      call { 
        controllers_HomeController_create2_invoker.call(
          req => HomeController_0.create(req))
      }
  
    // @LINE:13
    case controllers_HomeController_save3_route(params@_) =>
      call { 
        controllers_HomeController_save3_invoker.call(
          req => HomeController_0.save(req))
      }
  
    // @LINE:16
    case controllers_HomeController_edit4_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_edit4_invoker.call(
          req => HomeController_0.edit(req, id))
      }
  
    // @LINE:17
    case controllers_HomeController_update5_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_update5_invoker.call(
          req => HomeController_0.update(req, id))
      }
  
    // @LINE:20
    case controllers_HomeController_delete6_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_delete6_invoker.call(HomeController_0.delete(id))
      }
  
    // @LINE:23
    case controllers_Assets_at7_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at7_invoker.call(Assets_1.at(path, file))
      }
  
    // @LINE:25
    case controllers_SoftwareController_getDetailSoftware8_route(params@_) =>
      call { 
        controllers_SoftwareController_getDetailSoftware8_invoker.call(
          req => SoftwareController_2.getDetailSoftware(req))
      }
  
    // @LINE:26
    case controllers_SoftwareController_getDetailSoftware9_route(params@_) =>
      call { 
        controllers_SoftwareController_getDetailSoftware9_invoker.call(
          req => SoftwareController_2.getDetailSoftware(req))
      }
  
    // @LINE:27
    case controllers_SoftwareController_getDetailSoftware10_route(params@_) =>
      call { 
        controllers_SoftwareController_getDetailSoftware10_invoker.call(
          req => SoftwareController_2.getDetailSoftware(req))
      }
  
    // @LINE:28
    case controllers_SoftwareController_createSoftware11_route(params@_) =>
      call { 
        controllers_SoftwareController_createSoftware11_invoker.call(
          req => SoftwareController_2.createSoftware(req))
      }
  
    // @LINE:29
    case controllers_SoftwareController_getDetailSoftware12_route(params@_) =>
      call { 
        controllers_SoftwareController_getDetailSoftware12_invoker.call(
          req => SoftwareController_2.getDetailSoftware(req))
      }
  
    // @LINE:30
    case controllers_SoftwareController_getDetailSoftware13_route(params@_) =>
      call { 
        controllers_SoftwareController_getDetailSoftware13_invoker.call(
          req => SoftwareController_2.getDetailSoftware(req))
      }
  }
}
