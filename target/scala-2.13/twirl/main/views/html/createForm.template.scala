
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

object createForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[Computer],Map[String, String],Http.Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(computerForm: Form[Computer], companies: Map[String, String])(implicit request: Http.Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._

implicit def /*5.2*/implicitField/*5.15*/ = {{ FieldConstructor(tags.forms.field_constructor.render) }};
Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),format.raw/*5.76*/("""

"""),_display_(/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""

    """),format.raw/*9.5*/("""<h1 class="my-3" id="page-title">Add a computer</h1>

    """),_display_(/*11.6*/form(routes.HomeController.save())/*11.40*/ {_display_(Seq[Any](format.raw/*11.42*/("""

        """),_display_(/*13.10*/CSRF/*13.14*/.formField),format.raw/*13.24*/("""
        """),format.raw/*14.9*/("""<div class="row">
            <div class="col-md-3 mb-3">
            """),_display_(/*16.14*/inputText(computerForm("name"), Symbol("_label") -> "Computer name", Symbol("_help") -> "")),format.raw/*16.105*/("""
            """),format.raw/*17.13*/("""</div>
        </div>
        <div class="row">
            <div class="col-md-3 mb-3">
            """),_display_(/*21.14*/inputDate(computerForm("introduced"), Symbol("_label") -> "Introduced date", Symbol("_help") -> "")),format.raw/*21.113*/("""
            """),format.raw/*22.13*/("""</div>
        </div>
        <div class="row">
            <div class="col-md-3 mb-3">
            """),_display_(/*26.14*/inputDate(computerForm("discontinued"), Symbol("_label") -> "Discontinued date", Symbol("_help") -> "")),format.raw/*26.117*/("""
            """),format.raw/*27.13*/("""</div>
        </div>

        <div class="row">
            <div class="col-md-3 mb-3">
            """),_display_(/*32.14*/select(
                computerForm("company.id"),
                options(companies),
                Symbol("_label") -> "Company", Symbol("_default") -> "-- Choose a company --",
                Symbol("_showConstraints") -> false
            )),format.raw/*37.14*/("""
            """),format.raw/*38.13*/("""</div>
        </div>

        <div class="actions">
            <button class="btn btn-success" type="submit">Create this computer</button>
            <span class="mx-2">or</span>
            <a href=""""),_display_(/*44.23*/routes/*44.29*/.HomeController.list()),format.raw/*44.51*/("""" id="add" class="btn btn-light" role="button">Cancel</a>
        </div>
    """)))}),format.raw/*46.6*/("""

""")))}),format.raw/*48.2*/("""
"""))
      }
    }
  }

  def render(computerForm:Form[Computer],companies:Map[String, String],request:Http.Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(computerForm,companies)(request,messages)

  def f:((Form[Computer],Map[String, String]) => (Http.Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (computerForm,companies) => (request,messages) => apply(computerForm,companies)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/createForm.scala.html
                  HASH: 316cf2616586863601e40ed4637d3be6cf4047e1
                  MATRIX: 972->1|1169->128|1206->146|1227->159|1317->126|1344->144|1372->220|1400->223|1411->227|1449->229|1481->235|1566->294|1609->328|1649->330|1687->341|1700->345|1731->355|1767->364|1865->435|1978->526|2019->539|2147->640|2268->739|2309->752|2437->853|2562->956|2603->969|2732->1071|3001->1319|3042->1332|3273->1536|3288->1542|3331->1564|3439->1642|3472->1645
                  LINES: 27->1|30->3|32->5|32->5|33->2|34->4|35->5|37->7|37->7|37->7|39->9|41->11|41->11|41->11|43->13|43->13|43->13|44->14|46->16|46->16|47->17|51->21|51->21|52->22|56->26|56->26|57->27|62->32|67->37|68->38|74->44|74->44|74->44|76->46|78->48
                  -- GENERATED --
              */
          