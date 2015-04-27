package test3

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class Test3RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseURL("https://www.google.com.au")
		.inferHtmlResources()
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:37.0) Gecko/20100101 Firefox/37.0")

	val headers_1 = Map("Accept" -> "*/*")

	val headers_4 = Map("Accept" -> "image/png,image/*;q=0.8,*/*;q=0.5")

    val uri1 = "https://www.google.com.au:443"

	val scn = scenario("Test3RecordedSimulation")
		.exec(http("request_0")
			.get("/")
			.resources(http("request_1")
			.get(uri1 + "/xjs/_/js/k=xjs.s.en.CuHmmOEicC8.O/m=sx,c,sb,cdos,cr,elog,jsa,r,hsm,j,p,d,csi/am=pCSE-FsMwiApqCKEMg/rt=j/d=1/t=zcms/rs=ACT90oGYsO0t7WshNAURf3oSVLuJbUYxew")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_2")
			.get(uri1 + "/xjs/_/js/k=xjs.s.en.ooHbCcNYnEU.O/m=sy25,abd,sy73,sy72,sy71,sy74,async,erh,sy75,foot,fpe,sy153,hv,idck,ipv6,lc,sy130,sy137,lu,sy367,m,sf,vm/am=pCSE-FsMwiApqCKEMg/rt=j/d=0/t=zcms/rs=ACT90oFODlGjsUZMNCmadF6Qco70HFma5g")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_3")
			.get(uri1 + "/s?sclient=psy-ab&site=&source=hp&q=&oq=&gs_l=&pbx=1&bav=on.2,or.r_cp.&fp=f2b7e7bf0892fff7&biw=1131&bih=421&dpr=1&pf=p&sugexp=msedr&gs_rn=64&gs_ri=psy-ab&tok=ZfmlW4WoPgMVD4vmyzLp1Q&cp=0&gs_id=0&xhr=t&es_nrs=true&tch=1&ech=1&psi=20Y8Va-KL6XQmwX69ICgDg.1430013661114.1"),
            http("request_4")
			.get(uri1 + "/gen_204?v=3&s=webhp&imc=2&imn=2&imp=2&ei=20Y8Va-KL6XQmwX69ICgDg&e=3700306,3700348,4011559,4023709,4026624,4028932,4029815,4030092,4030440,4031414,4031622,4031691,4031707,4031804,4032440,4032479,4032500,4032568,4032622,4032677,4032711,4032908,4033114,4033256,4034154,4034408,8300096,8500394,8500886,8500948,8500973,8501247,8501280,8501295,8501313,8501350,8501393,8501407,10200083,10200793,10201001,10201140&atyp=csi&adh=&xjs=init.27.22.sb.19.p.3.m.2.jsa.1.erh.1&action=&rt=xjsls.52,prt.53,xjses.849,xjsee.896,xjs.910,ol.1479,iml.278,wsrt.6081,cst.0,dnst.0,rqst.661,rspt.1002,rqstt.5450,unt.4854,cstt.4854,dit.20")
			.headers(headers_4)))
		.pause(14)
		.exec(http("request_5")
			.get("/s?sclient=psy-ab&site=&source=hp&q=t&oq=&gs_l=&pbx=1&bav=on.2,or.r_cp.&bvm=bv.91665533,d.dGY&fp=f2b7e7bf0892fff7&biw=1128&bih=448&dpr=1&pf=p&sugexp=msedr&gs_rn=64&gs_ri=psy-ab&tok=ZfmlW4WoPgMVD4vmyzLp1Q&cp=1&gs_id=lu&xhr=t&es_nrs=true&tch=1&ech=2&psi=20Y8Va-KL6XQmwX69ICgDg.1430013661114.1")
			.resources(http("request_6")
			.get(uri1 + "/s?sclient=psy-ab&site=&source=hp&q=te&oq=&gs_l=&pbx=1&bav=on.2,or.r_cp.&bvm=bv.91665533,d.dGY&fp=f2b7e7bf0892fff7&biw=1128&bih=448&dpr=1&pf=p&sugexp=msedr&gs_rn=64&gs_ri=psy-ab&tok=ZfmlW4WoPgMVD4vmyzLp1Q&cp=2&gs_id=m5&xhr=t&es_nrs=true&tch=1&ech=3&psi=20Y8Va-KL6XQmwX69ICgDg.1430013661114.1"),
            http("request_7")
			.get(uri1 + "/s?sclient=psy-ab&site=&source=hp&q=tes&oq=&gs_l=&pbx=1&bav=on.2,or.r_cp.&bvm=bv.91665533,d.dGY&fp=f2b7e7bf0892fff7&biw=1128&bih=448&dpr=1&pf=p&sugexp=msedr&gs_rn=64&gs_ri=psy-ab&tok=ZfmlW4WoPgMVD4vmyzLp1Q&cp=3&gs_id=mh&xhr=t&es_nrs=true&tch=1&ech=4&psi=20Y8Va-KL6XQmwX69ICgDg.1430013661114.1"),
            http("request_8")
			.get(uri1 + "/gen_204?atyp=i&ct=1&cad=1&rsm=6&ei=20Y8Va-KL6XQmwX69ICgDg&zx=1430013677008")
			.headers(headers_4),
            http("request_9")
			.get(uri1 + "/s?sclient=psy-ab&site=&source=hp&q=test&oq=&gs_l=&pbx=1&bav=on.2,or.r_cp.&bvm=bv.91665533,d.dGY&fp=f2b7e7bf0892fff7&biw=1128&bih=448&dpr=1&pf=p&sugexp=msedr&gs_rn=64&gs_ri=psy-ab&tok=ZfmlW4WoPgMVD4vmyzLp1Q&cp=4&gs_id=my&xhr=t&es_nrs=true&tch=1&ech=5&psi=20Y8Va-KL6XQmwX69ICgDg.1430013661114.1"),
            http("request_10")
			.get(uri1 + "/search?sclient=psy-ab&site=&source=hp&q=test&oq=test&gs_l=hp.3..0l2j0i3j0.15543.15822.0.16588.12.12.0.0.0.0.409.1374.7j0j1j2j1.11.0.msedr...0...1c.1.64.psy-ab..9.3.1067.0.CYVlIfTGBOc&pbx=1&bav=on.2,or.r_cp.&bvm=bv.91665533,d.dGY&fp=f2b7e7bf0892fff7&biw=1128&bih=448&dpr=1&tch=1&ech=1&psi=20Y8Va-KL6XQmwX69ICgDg.1430013661114.3"),
            http("request_11")
			.get(uri1 + "/xjs/_/js/k=xjs.s.en.ooHbCcNYnEU.O/m=aspn,sy165,sy347,sy348,sy11,sy36,sy349,sy362,sy9,sy363,dvl,sy51,sy52,sy129,em12,vs,sy43,sy44,sy46,sy48,sy45,sy49,sy47,sy76,sy79,sy77,tnv,sy331,sy332,lrdc,me/am=pCSE-FsMwiApqCKEMg/rt=j/d=0/t=zcms/rs=ACT90oFODlGjsUZMNCmadF6Qco70HFma5g")
			.headers(headers_1),
            http("request_12")
			.get(uri1 + "/gen_204?v=3&s=web&e=3700306,3700348,4011559,4023709,4026624,4028932,4029815,4030092,4030440,4031414,4031622,4031691,4031707,4031804,4032440,4032479,4032500,4032568,4032622,4032677,4032711,4032908,4033114,4033256,4034154,4034408,8300096,8500394,8500886,8500948,8500973,8501247,8501280,8501295,8501313,8501350,8501393,8501407,10200083,10200793,10201001,10201140&ei=7UY8Vfr5NIW5mAXL4oGoBg&cr=c&imp=1&pfa=n.4,ttfc.286,ttlc.0,cbt.57&pfm=n.4,ttfc.369,ttlc.0,cbt.57&pmd=max.2,avg.1,1,0,1,0,0,0,0,1,0,1,1,0,1,0,2,1,1,1,1,1&imn=3&atyp=csi&adh=&xjs=dispose.3.12.m.1.jsa.1.sb.1.lu.0.ipv6.0,init.14.25.fpe.5.dvl.3.m.2.sb.1.jsa.1&action=&rt=prt.83,pprt.83,ol.83,jsrt.574,iml.675,kpr.1652,bpl.24152")
			.headers(headers_4)))
		.pause(3)
		.exec(http("request_13")
			.get("/s?sclient=psy-ab&biw=1128&bih=448&q=&oq=&gs_l=&pbx=1&bav=on.2,or.r_cp.&bvm=bv.91665533,d.dGY&fp=f2b7e7bf0892fff7&pf=p&bs=1&sugexp=msedr&gs_rn=64&gs_ri=psy-ab&tok=ZfmlW4WoPgMVD4vmyzLp1Q&pq=test&cp=0&gs_id=st&xhr=t&es_nrs=true&tch=1&ech=2&psi=20Y8Va-KL6XQmwX69ICgDg.1430013661114.3"))
		.pause(1)
		.exec(http("request_14")
			.get("/s?sclient=psy-ab&biw=1128&bih=448&q=tes&oq=&gs_l=&pbx=1&bav=on.2,or.r_cp.&bvm=bv.91665533,d.dGY&fp=f2b7e7bf0892fff7&pf=p&sugexp=msedr&gs_rn=64&gs_ri=psy-ab&tok=ZfmlW4WoPgMVD4vmyzLp1Q&pq=test&cp=3&gs_id=y6&xhr=t&es_nrs=true&tch=1&ech=5&psi=20Y8Va-KL6XQmwX69ICgDg.1430013661114.3")
			.resources(http("request_15")
			.get(uri1 + "/s?sclient=psy-ab&biw=1128&bih=448&q=t&oq=&gs_l=&pbx=1&bav=on.2,or.r_cp.&bvm=bv.91665533,d.dGY&fp=f2b7e7bf0892fff7&pf=p&sugexp=msedr&gs_rn=64&gs_ri=psy-ab&tok=ZfmlW4WoPgMVD4vmyzLp1Q&pq=test&cp=1&gs_id=xk&xhr=t&es_nrs=true&tch=1&ech=3&psi=20Y8Va-KL6XQmwX69ICgDg.1430013661114.3"),
            http("request_16")
			.get(uri1 + "/s?sclient=psy-ab&biw=1128&bih=448&q=te&oq=&gs_l=&pbx=1&bav=on.2,or.r_cp.&bvm=bv.91665533,d.dGY&fp=f2b7e7bf0892fff7&pf=p&sugexp=msedr&gs_rn=64&gs_ri=psy-ab&tok=ZfmlW4WoPgMVD4vmyzLp1Q&pq=test&cp=2&gs_id=xt&xhr=t&es_nrs=true&tch=1&ech=4&psi=20Y8Va-KL6XQmwX69ICgDg.1430013661114.3"),
            http("request_17")
			.get(uri1 + "/s?sclient=psy-ab&biw=1128&bih=448&q=test3&oq=&gs_l=&pbx=1&bav=on.2,or.r_cp.&bvm=bv.91665533,d.dGY&fp=f2b7e7bf0892fff7&pf=p&sugexp=msedr&gs_rn=64&gs_ri=psy-ab&tok=ZfmlW4WoPgMVD4vmyzLp1Q&pq=test&cp=5&gs_id=10d&xhr=t&es_nrs=true&tch=1&ech=7&psi=20Y8Va-KL6XQmwX69ICgDg.1430013661114.3"),
            http("request_18")
			.get(uri1 + "/search?sclient=psy-ab&biw=1128&bih=448&q=test3&oq=test3&gs_l=hp.3..0j0i10l2j0.5130.7656.1.8070.6.6.0.0.0.0.625.2417.2-1j0j2j2.5.0.msedr...0...1c.1.64.psy-ab..11.7.3021.0.J-R85Av4wNY&pbx=1&bav=on.2,or.r_cp.&bvm=bv.91665533,d.dGY&fp=f2b7e7bf0892fff7&tch=1&ech=1&psi=20Y8Va-KL6XQmwX69ICgDg.1430013661114.5"),
            http("request_19")
			.get(uri1 + "/gen_204?v=3&s=web&e=3700306,3700348,4011559,4023709,4026624,4028932,4029815,4030092,4030440,4031414,4031622,4031691,4031707,4031804,4032440,4032479,4032500,4032568,4032622,4032677,4032711,4032908,4033114,4033256,4034154,4034408,8300096,8500394,8500886,8500948,8500973,8501247,8501280,8501295,8501313,8501350,8501393,8501407,10200083,10200793,10201001,10201140&ei=9UY8VaKqO8PImwXVrYCwDw&cr=n&imp=1&pfa=n.6,ttfc.299,ttlc.0,cbt.124&pfm=n.6,ttfc.431,ttlc.0,cbt.124&pmd=max.1,avg.0,0,0,1,0,1,0,0,1,0,0,0,0,0,1,0,0,0,1,0,1&imn=4&atyp=csi&adh=&xjs=dispose.4.15.sb.2.aspn.1.jsa.1.vs.0.dvl.0,init.11.25.dvl.6.c.1.jsa.1.foot.1.lu.1&action=&rt=prt.76,pprt.76,ol.76,jsrt.637,iml.518,kpr.9795,bpl.32295")
			.headers(headers_4)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}