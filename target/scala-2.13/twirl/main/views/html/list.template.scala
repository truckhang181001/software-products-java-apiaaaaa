
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

object list extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[io.ebean.PagedList[Computer],String,String,String,Http.Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentPage: io.ebean.PagedList[Computer],
    currentSortBy: String,
    currentOrder: String,
    currentFilter: String)(
    implicit request: Http.Request,
    messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*37.2*/header/*37.8*/(key:String, title:String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*37.38*/("""
  """),format.raw/*38.3*/("""<th scope="col" class=""""),_display_(/*38.27*/key/*38.30*/.replace(".","_")),format.raw/*38.47*/("""">
    <a class="sort-link """),_display_(/*39.26*/if(currentSortBy != key)/*39.50*/ {_display_(Seq[Any](format.raw/*39.52*/(""" """),format.raw/*39.53*/("""sort-link-inactive """)))}),format.raw/*39.73*/("""" href=""""),_display_(/*39.82*/link(0, key)),format.raw/*39.94*/("""">"""),_display_(/*39.97*/title),format.raw/*39.102*/(""" """),_display_(/*39.104*/sortIcon(key)),format.raw/*39.117*/("""</a>
  </th>
""")))};def /*44.2*/sortIcon/*44.10*/(key:String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*44.26*/("""
"""),_display_(/*45.2*/if(currentOrder == "asc")/*45.27*/ {_display_(Seq[Any](format.raw/*45.29*/("""
  """),format.raw/*46.3*/("""<i class="fa fa-fw fa-caret-down"></i>
""")))}/*47.3*/else/*47.8*/{_display_(Seq[Any](format.raw/*47.9*/("""
  """),format.raw/*48.3*/("""<i class="fa fa-fw fa-caret-up"></i>
""")))}),format.raw/*49.2*/("""

""")))};def /*11.2*/link/*11.6*/(newPage:Int, newSortBy:String) = {{

  var sortBy = currentSortBy
  var order = currentOrder

  if(newSortBy != null) {
    sortBy = newSortBy
    if(currentSortBy == newSortBy) {
      if(currentOrder == "asc") {
        order = "desc"
      } else {
        order = "asc"
      }
    } else {
      order = "asc"
    }
  }

  // Generate the link
  routes.HomeController.list(newPage, sortBy, order, currentFilter)

}};
Seq[Any](format.raw/*7.1*/("""
"""),format.raw/*10.42*/("""
"""),format.raw/*32.2*/("""

  """),format.raw/*36.39*/("""
"""),format.raw/*41.2*/("""


"""),format.raw/*51.2*/("""

"""),_display_(/*53.2*/main/*53.6*/ {_display_(Seq[Any](format.raw/*53.8*/("""

  """),format.raw/*55.3*/("""<h1 class="my-3" id="page-title">"""),_display_(/*55.37*/Messages("computers.list.title", currentPage.getTotalCount)),format.raw/*55.96*/("""</h1>

  """),_display_(/*57.4*/request/*57.11*/.flash.asScala().get("success").map/*57.46*/ { successFlashValue =>_display_(Seq[Any](format.raw/*57.69*/("""
    """),format.raw/*58.5*/("""<div class="alert alert-warning" role="alert">
      <strong>Done!</strong> """),_display_(/*59.31*/successFlashValue),format.raw/*59.48*/("""
    """),format.raw/*60.5*/("""</div>
  """)))}),format.raw/*61.4*/("""

  """),format.raw/*63.3*/("""<div class="row">
    <div class="col-sm-6">
      <form class="form-inline" action=""""),_display_(/*65.42*/link(0, "name")),format.raw/*65.57*/("""" method="GET">
        <div class="form-group mr-sm-2 mb-2">
          <label for="searchbox" class="sr-only">Filter by computer name...</label>
          <input type="search" class="form-control" id="searchbox" name="f" value=""""),_display_(/*68.85*/currentFilter),format.raw/*68.98*/("""" placeholder="Filter by computer name...">
        </div>
        <button type="submit" id="searchsubmit" class="btn btn-primary mb-2">Filter by name</button>
      </form>
    </div>
    <div class="col-sm-6">
      <a href=""""),_display_(/*74.17*/routes/*74.23*/.HomeController.create()),format.raw/*74.47*/("""" id="add" class="btn btn-success float-right" role="button"1>Add a new computer</a>
    </div>
  </div>

  """),_display_(/*78.4*/if(currentPage.getTotalCount == 0)/*78.38*/ {_display_(Seq[Any](format.raw/*78.40*/("""

    """),format.raw/*80.5*/("""<div class="card card-body bg-light">
      <em>Nothing to display</em>
    </div>

  """)))}/*84.5*/else/*84.10*/{_display_(Seq[Any](format.raw/*84.11*/("""

    """),format.raw/*86.5*/("""<table class="table table-bordered table-striped table-hover">
      <thead class="thead-light">
        <tr>
          """),_display_(/*89.12*/header("name", "Computer name")),format.raw/*89.43*/("""
          """),_display_(/*90.12*/header("introduced", "Introduced")),format.raw/*90.46*/("""
          """),_display_(/*91.12*/header("discontinued", "Discontinued")),format.raw/*91.50*/("""
          """),_display_(/*92.12*/header("company.name", "Company")),format.raw/*92.45*/("""
        """),format.raw/*93.9*/("""</tr>
      </thead>
      <tbody>

      """),_display_(/*97.8*/for(computer <- currentPage.getList.asScala) yield /*97.52*/ {_display_(Seq[Any](format.raw/*97.54*/("""
        """),format.raw/*98.9*/("""<tr>
          <td><a href=""""),_display_(/*99.25*/routes/*99.31*/.HomeController.edit(computer.getId())),format.raw/*99.69*/("""">"""),_display_(/*99.72*/computer/*99.80*/.getName()),format.raw/*99.90*/("""</a></td>
          <td>
          """),_display_(/*101.12*/if(computer.getIntroduced() == null)/*101.48*/ {_display_(Seq[Any](format.raw/*101.50*/("""
            """),format.raw/*102.13*/("""<em>-</em>
          """)))}/*103.13*/else/*103.18*/{_display_(Seq[Any](format.raw/*103.19*/("""
            """),_display_(/*104.14*/computer/*104.22*/.getIntroduced().format("dd MMM yyyy")),format.raw/*104.60*/("""
          """)))}),format.raw/*105.12*/("""
          """),format.raw/*106.11*/("""</td>
          <td>
          """),_display_(/*108.12*/if(computer.getDiscontinued() == null)/*108.50*/ {_display_(Seq[Any](format.raw/*108.52*/("""
            """),format.raw/*109.13*/("""<em>-</em>
          """)))}/*110.13*/else/*110.18*/{_display_(Seq[Any](format.raw/*110.19*/("""
            """),_display_(/*111.14*/computer/*111.22*/.getDiscontinued().format("dd MMM yyyy")),format.raw/*111.62*/("""
          """)))}),format.raw/*112.12*/("""
          """),format.raw/*113.11*/("""</td>
          <td>
          """),_display_(/*115.12*/if(computer.getCompany() == null)/*115.45*/ {_display_(Seq[Any](format.raw/*115.47*/("""
            """),format.raw/*116.13*/("""<em>-</em>
          """)))}/*117.13*/else/*117.18*/{_display_(Seq[Any](format.raw/*117.19*/("""
            """),_display_(/*118.14*/computer/*118.22*/.getCompany().getName()),format.raw/*118.45*/("""
          """)))}),format.raw/*119.12*/("""
          """),format.raw/*120.11*/("""</td>
        </tr>
      """)))}),format.raw/*122.8*/("""

      """),format.raw/*124.7*/("""</tbody>
    </table>

    <nav aria-label="...">
      <ul class="pagination float-right">
        """),_display_(/*129.10*/if(currentPage.hasPrev)/*129.33*/ {_display_(Seq[Any](format.raw/*129.35*/("""
          """),format.raw/*130.11*/("""<li class="page-item previous">
            <a class="page-link" href=""""),_display_(/*131.41*/link(currentPage.getPageIndex - 1, null)),format.raw/*131.81*/("""">&larr; Previous</a>
          </li>
        """)))}/*133.11*/else/*133.16*/{_display_(Seq[Any](format.raw/*133.17*/("""
          """),format.raw/*134.11*/("""<li class="page-item previous disabled">
            <a class="page-link">&larr; Previous</a>
          </li>
        """)))}),format.raw/*137.10*/("""
        """),format.raw/*138.9*/("""<li class="page-item disabled" aria-current="page">
          <a class="page-link" href="#">Displaying """),_display_(/*139.53*/currentPage/*139.64*/.getDisplayXtoYofZ(" to "," of ")),format.raw/*139.97*/("""</a>
        </li>
        """),_display_(/*141.10*/if(currentPage.hasNext)/*141.33*/ {_display_(Seq[Any](format.raw/*141.35*/("""
          """),format.raw/*142.11*/("""<li class="page-item next">
            <a class="page-link" href=""""),_display_(/*143.41*/link(currentPage.getPageIndex + 1, null)),format.raw/*143.81*/("""">Next &rarr;</a>
          </li>
        """)))}/*145.11*/else/*145.16*/{_display_(Seq[Any](format.raw/*145.17*/("""
          """),format.raw/*146.11*/("""<li class="page-item next disabled">
            <a class="page-link" >Next &rarr;</a>
          </li>
        """)))}),format.raw/*149.10*/("""
      """),format.raw/*150.7*/("""</ul>
    </nav>

  """)))}),format.raw/*153.4*/("""
""")))}),format.raw/*154.2*/("""
"""))
      }
    }
  }

  def render(currentPage:io.ebean.PagedList[Computer],currentSortBy:String,currentOrder:String,currentFilter:String,request:Http.Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter)(request,messages)

  def f:((io.ebean.PagedList[Computer],String,String,String) => (Http.Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter) => (request,messages) => apply(currentPage,currentSortBy,currentOrder,currentFilter)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/list.scala.html
                  HASH: c9e7cbc342a0d73cc36aef180c0e8b28e111da8b
                  MATRIX: 981->1|1254->866|1268->872|1375->902|1405->905|1456->929|1468->932|1506->949|1561->977|1594->1001|1634->1003|1663->1004|1714->1024|1750->1033|1783->1045|1813->1048|1840->1053|1870->1055|1905->1068|1942->1086|1959->1094|2052->1110|2080->1112|2114->1137|2154->1139|2184->1142|2242->1183|2254->1188|2292->1189|2322->1192|2390->1230|2416->324|2428->328|2877->196|2906->322|2934->748|2966->864|2994->1082|3024->1233|3053->1236|3065->1240|3104->1242|3135->1246|3196->1280|3276->1339|3312->1349|3328->1356|3372->1391|3433->1414|3465->1419|3569->1496|3607->1513|3639->1518|3679->1528|3710->1532|3823->1618|3859->1633|4116->1863|4150->1876|4405->2104|4420->2110|4465->2134|4600->2243|4643->2277|4683->2279|4716->2285|4821->2373|4834->2378|4873->2379|4906->2385|5054->2506|5106->2537|5145->2549|5200->2583|5239->2595|5298->2633|5337->2645|5391->2678|5427->2687|5496->2730|5556->2774|5596->2776|5632->2785|5688->2814|5703->2820|5762->2858|5792->2861|5809->2869|5840->2879|5904->2915|5950->2951|5991->2953|6033->2966|6075->2989|6089->2994|6129->2995|6171->3009|6189->3017|6249->3055|6293->3067|6333->3078|6393->3110|6441->3148|6482->3150|6524->3163|6566->3186|6580->3191|6620->3192|6662->3206|6680->3214|6742->3254|6786->3266|6826->3277|6886->3309|6929->3342|6970->3344|7012->3357|7054->3380|7068->3385|7108->3386|7150->3400|7168->3408|7213->3431|7257->3443|7297->3454|7355->3481|7391->3489|7520->3590|7553->3613|7594->3615|7634->3626|7734->3698|7796->3738|7863->3786|7877->3791|7917->3792|7957->3803|8108->3922|8145->3931|8277->4035|8298->4046|8353->4079|8409->4107|8442->4130|8483->4132|8523->4143|8619->4211|8681->4251|8744->4295|8758->4300|8798->4301|8838->4312|8982->4424|9017->4431|9069->4452|9102->4454
                  LINES: 27->1|36->37|36->37|38->37|39->38|39->38|39->38|39->38|40->39|40->39|40->39|40->39|40->39|40->39|40->39|40->39|40->39|40->39|40->39|42->44|42->44|44->44|45->45|45->45|45->45|46->46|47->47|47->47|47->47|48->48|49->49|51->11|51->11|73->7|74->10|75->32|77->36|78->41|81->51|83->53|83->53|83->53|85->55|85->55|85->55|87->57|87->57|87->57|87->57|88->58|89->59|89->59|90->60|91->61|93->63|95->65|95->65|98->68|98->68|104->74|104->74|104->74|108->78|108->78|108->78|110->80|114->84|114->84|114->84|116->86|119->89|119->89|120->90|120->90|121->91|121->91|122->92|122->92|123->93|127->97|127->97|127->97|128->98|129->99|129->99|129->99|129->99|129->99|129->99|131->101|131->101|131->101|132->102|133->103|133->103|133->103|134->104|134->104|134->104|135->105|136->106|138->108|138->108|138->108|139->109|140->110|140->110|140->110|141->111|141->111|141->111|142->112|143->113|145->115|145->115|145->115|146->116|147->117|147->117|147->117|148->118|148->118|148->118|149->119|150->120|152->122|154->124|159->129|159->129|159->129|160->130|161->131|161->131|163->133|163->133|163->133|164->134|167->137|168->138|169->139|169->139|169->139|171->141|171->141|171->141|172->142|173->143|173->143|175->145|175->145|175->145|176->146|179->149|180->150|183->153|184->154
                  -- GENERATED --
              */
          