
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Computers database</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*9.66*/routes/*9.72*/.Assets.at("stylesheets/bootstrap/bootstrap.min.css")),format.raw/*9.125*/("""">
    <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">

    <link rel="stylesheet" media="screen" href=""""),_display_(/*12.50*/routes/*12.56*/.Assets.at("stylesheets/main.css")),format.raw/*12.90*/(""""/>
  </head>
  <body>

    <nav class="navbar navbar-expand-md navbar-dark bg-dark">
      <a class="navbar-brand" href=""""),_display_(/*17.38*/routes/*17.44*/.HomeController.index()),format.raw/*17.67*/("""">Play sample application &mdash; Computer database</a>
    </nav>

    <main role="main" class="container-fluid">
    """),_display_(/*21.6*/content),format.raw/*21.13*/("""
    """),format.raw/*22.5*/("""</main>

  </body>
</html>
"""))
      }
    }
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply(content)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (content) => apply(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/main.scala.html
                  HASH: 13aefe7ce9b2b0720f59389834631127631877f2
                  MATRIX: 904->1|1013->17|1040->18|1319->271|1333->277|1407->330|1592->488|1607->494|1662->528|1812->651|1827->657|1871->680|2017->800|2045->807|2077->812
                  LINES: 27->1|32->2|33->3|39->9|39->9|39->9|42->12|42->12|42->12|47->17|47->17|47->17|51->21|51->21|52->22
                  -- GENERATED --
              */
          