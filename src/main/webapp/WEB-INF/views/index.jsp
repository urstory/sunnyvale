<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="en" class="no-js"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en" class="no-js"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en" class="no-js"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html lang="<spring:message code='lang'/>" class="no-js"> <!--<![endif]-->
<head>
	<title>써니베일 - 사람과 사람, 써니베일</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
	<meta name="description" content="IT 교육 전문">
	<meta name="author" content="The Develovers">

	
	<!-- CSS -->
	<link href="assets/css/main.css" media="screen, projection" rel="stylesheet" type="text/css" />
	
	<!-- i18n CSS -->
	<link href="assets/css/i18n_<spring:message code='lang' />.css" media="screen, projection" rel="stylesheet" type="text/css" />
	
	
	<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="assets/js/html5shiv.js"></script>
      <script src="assets/js/respond.min.js"></script>
    <![endif]-->

    <!-- Fav and touch icons -->
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="assets/ico/touch-icon-57-precomposed.png">
  	<link rel="shortcut icon" href="assets/ico/favicon.png">

</head>
<body data-spy="scroll" data-target="#main-nav">
	<!-- WRAPPER -->
	<div class="wrapper">
				
		<!-- main navigation -->
		<nav class="navbar navbar-default navbar-fixed-top" id="main-nav" role="navigation">
			<div class="container">
				<!-- brand and toggle -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".main-nav-collapse">
						<span class="sr-only">Toggle Navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>					
				</div>
				<!-- navigation links -->
				<div class="collapse navbar-collapse main-nav-collapse">
					<ul class="nav navbar-nav">
						<li><a href="#header">HOME</a></li>
						<li><a href="#about-me">ABOUT</a></li>
						<li><a href="#resume">RESUME</a></li>
						<li><a href="#projects">PROJECTS</a></li>
						<li><a href="#contacts">CONTACTS</a></li>
						<!--
						<li>							
							<spring:message code="home.language" />						
						</li>
						-->
					</ul>
				</div>
			</div>
		</nav>
		<!-- end main navigation -->
				
		<!-- header -->
		<header class="jumbotron header" id="header">
			<div class="container">
				<div class="row">
				 
					<div class="col-md-6 left header-jumbotron">
						<div class="avatar">
							<spring:message code="home.image" />							
						</div>
					</div>

					<div class="col-md-6 right">
						<h1 class="hide">Sunnyvale</h1>
						<h2 class="heading"><spring:message code="home.slogan" /></h2>
						<p><spring:message code="home.content" /></p>
						<a href="#about-me" class="btn btn-default btn-lg"><spring:message code="home.detail.btn" /></a><a href="#resume" class="btn btn-primary btn-primary-2 btn-lg">연혁</a>
					</div>
				</div>
			</div>
		</header>
		<!-- end header -->


		<!-- about-me -->
		<section class="section about-me" id="about-me">
			<div class="container">
				<h2 class="heading">ABOUT</h2>
				<p><spring:message code="about.introduce.title-01" /></p>
				<p style="font-size:15px"><spring:message code="about.introduce.title-02" />
				</p>					
					
				<div class="row interest">
					<div class="col-md-12">
						<h3 class="sub-heading"><span class="glyphicon icon-book"></span>for Education </h3>
						<p style="font-size:15px"><spring:message code="about-adu-01" /></p>
						<br>
						<p><spring:message code="about-adu-02" /></p>
					</div>
				</div>
				
			</div>
		</section>
		<!-- end about-me -->

		<!-- resume -->
		<section class="section resume" id="resume">
			<div class="container">
				<h2 class="heading">RESUME</h2>
				<ul class="timeline">
					<li class="year">2017</li>
					<li class="event">
						<h3 class="heading">IT교육 및 서비스 개발</h3>
						<span class="month"><i class="icon icon-calendar"></i>2017년</span>

						<p>
							<span class="mon-align-tw"></span>
							<span class="mon-content">
								재단법인 커넥트(connect.or.k)<br> 백엔드 프로그래밍 메인 튜터 활동
							</span>
						</p>
					</li>
					<li class="event" style="display:none;">
					</li>

					<li class="year">2016</li>
					<li class="event">
						<h3 class="heading">IT교육 및 서비스 개발</h3>
						<span class="month"><i class="icon icon-calendar"></i>2016년</span>
						<p>
							<span class="mon-align-tw"></span>
							<span class="mon-content">
								비트 교육센터 전문가 반 교육<br>
								비트 교육센터 개발자 교육<br>
							</span>
						</p>
						<p>
							<span class="mon-align-tw"></span>
							<span class="mon-content">
								http://www.tryhelloworld.co.kr<br>자바 온라인 교육
							</span>
						</p>
					</li>
					<li class="event" style="display:none;">
					</li>
					<li class="year">2015</li>
					<li class="event">
						<h3 class="heading">IT교육 및 서비스 개발</h3>
						<span class="month"><i class="icon icon-calendar"></i>2015년</span>

						<p>
							<span class="mon-align-tw">1월.</span>
							<span class="mon-content">
								폴리텍 대학 - 자바/프레임워크/HTML5 교육<br>
								상명대학교 - JAVA/HTML5/안드로이드/파이썬 교육<br>
							</span>
						</p>
						<p>
							<span class="mon-align-tw">2월.</span>
							<span class="mon-content">
								건국대학교-C프로그래밍 교육<br>
								SK플래닛-신입사원 교육<br>
							</span>
						</p>
						<p>
							<span class="mon-align-tw">3월.</span>
							<span class="mon-content">
								SK플래닛-신입사원 교육<br>
								삼성SDS 신입사원 교육
							</span>
						</p>
						<p>
							<span class="mon-align-tw">4월.</span>
							<span class="mon-content">
								삼성SDS 신입사원 교육<br>
							</span>
						</p>
						<p>
							<span class="mon-align-tw">5월.</span>
							<span class="mon-content">
								SK Planet - 애플의 새로운 개발 언어 : Swift 교육<br>
								삼성SDS 직무전환 교육<BR>
								삼성SDS ICTO과정
							</span>
						</p>
						<p>
							<span class="mon-align-tw">7월.</span>
							<span class="mon-content">
								비트 교육센터 - 여름방학 자바특강<br>
								비트 교육센터 - 스펙초월 과정<BR>
								삼성SDS - 대용량 아키텍처
							</span>
						</p>

					</li>
					<li class="event" style="display:none;">
					</li>

					<li class="year">2014</li>
					<li class="event">
						<h3 class="heading">IT교육 및 서비스 개발</h3>
						<span class="month"><i class="icon icon-calendar"></i>2014년</span>
						<p>
						<span class="mon-align-tw">1월.</span>
							<span class="mon-content">
								벤처 기업 인증 획득<br>
								삼성SDS preSTC 자바 교육<br>
							</span>
						</p>
						<p>
						<span class="mon-align-tw">3월</span>
							<span class="mon-content">
								벤처 기업 인증 획득<br>
								기업용 SNS. 헬로 마이 오피스 Beta버전 시작<br>
								SK플래닛 신입사원 교육
							</span>
						</p>
						<p>
							<span class="mon-align-tw">4월</span>
							<span class="mon-content">
								OTS-분석/설계 교육<br>
							</span>
						</p>
						<p>
							<span class="mon-align-tw">5월</span>
							<span class="mon-content">
								삼성SDS 프레임워크 교육<br>
								스마일 서브 - 파이썬 교육<br>
							</span>
						</p>
						<p>
							<span class="mon-align-tw">6월</span>
							<span class="mon-content">
								삼성SDS 역량강화 교육<br>
							</span>
						</p>
						<p>
							<span class="mon-align-tw">7월</span>
							<span class="mon-content">
								삼성SDS 인턴 교육<br>
								삼성SDS 역량강화 교육<br>
								비트-건국대학교 C 교육<br>
								상명대학교 자바 교육
							</span>
						</p>
						<p>
							<span class="mon-align-tw">7월</span>
							<span class="mon-content">
								비트-건국대학교 C 교육<br>
								상명대학교 자바/안드로이드/HTML5 교육
							</span>
						</p>
						<p>
							<span class="mon-align-tw">8월</span>
							<span class="mon-content">
								비트-건국대학교 자바 교육<br>
								상명대학교 자바/안드로이드/HTML5 교육
							</span>
						</p>
						<p>
							<span class="mon-align-tw">9월</span>
							<span class="mon-content">
								상명대학교 자바/안드로이드/HTML5 교육<br>
								삼성SDS ICTO교육<br>
								전자부품연구원-HTML5 교육
							</span>
						</p>
						<p>
							<span class="mon-align-tw">10월</span>
							<span class="mon-content">
								삼성SDS ICTO교육<br>
								삼성SDS-실전!업무개발 교육<br>
								SK플래닛 - 자바 웹 프로그래밍 교육
							</span>
						</p>
						<p>
							<span class="mon-align-tw">11월</span>
							<span class="mon-content">
								삼성SDS ICTO교육<br>
								삼성SDS-실전!업무개발 교육<br>
								SK플래닛 - 자바 웹 프로그래밍 교육<br>
								GoClass 교육 서비스 Beta 시작
							</span>
						</p>
						<p>
							<span class="mon-align-tw">12월</span>
							<span class="mon-content">
								폴리텍 대학 - 자바/프레임워크/HTML5교육
							</span>
						</p>
					</li>
					<li class="event" style="display:none;">
					</li>

					<li class="year">2013</li>
					<li class="event">
						<h3 class="heading">IT교육 및 서비스 개발</h3>
						<span class="month"><i class="icon icon-calendar"></i>2013년</span>
						<p>

						<span class="mon-align-tw">1월.</span>
						<span class="mon-content">
							SK커뮤니케이션즈 설계 교육.<br>
							삼성전자 서비스-JAVA,프레임워크,안드로이드 교육<br>
							비트-나무인터넷-PHP 교육<br>
							삼성 SDS 멀티캠퍼스 JAVA 교육
						</span>
						</p>
						<p>
						<span class="mon-align-tw">2월.</span>
						<span class="mon-content">
							삼성전자 서비스-JAVA,프레임워크,안드로이드 교육<br>
							SK플래닛 - 신입사원 교육.<br>
						</span>
						</p>
						<p>
						<span class="mon-align-tw">3월.</span>
						<span class="mon-content">
							SK플래닛 - 신입사원 교육.<br>
						</span>
						</p>
						<p>
						<span class="mon-align-tw">4월.</span>
						<span class="mon-content">
							캠핑 전문 SNS yacamp.com 서비스 시작.<br>
							신한은행 - BA교육
						</span>
						</p>
						<p>
						<span class="mon-align-tw">5월.</span>
						<span class="mon-content">
							OTS-분석설계 교육.<br>
						</span>
						</p>
						<p>
						<span class="mon-align-tw">6월.</span>
						<span class="mon-content">
							삼성전자 서비스 - 안드로이드 교육<br>
							SK커뮤니케이션즈-프레임워크 교육
						</span>
						</p>
						<p>
						<span class="mon-align-tw">7월.</span>
						<span class="mon-content">
							삼성 SDS - 인턴 교육<br>
							상명 대학교 - 자바/안드로이드 교육<br>
							SK커뮤니케이션즈-자바 교육
						</span>
						</p>
						<p>
						<span class="mon-align-tw">8월.</span>
						<span class="mon-content">
							상명 대학교 - 자바/안드로이드 교육<br>
							건국대학교-PHP교육
						</span>
						</p>
						<p>
						<span class="mon-align-tw">9월.</span>
						<span class="mon-content">
							SK플래닛-자바웹개발 교육
						</span>
						</p>
						<p>
						<span class="mon-align-tw">10월.</span>
						<span class="mon-content">
							소프트웨어 사업자 등록<br>
							SK커뮤니케이션즈-자바교육
						</span>
						</p>
						<p>
						<span class="mon-align-tw">11월</span>
						<span class="mon-content">
							기술부설연구소(연구전담부서)등록<br>
							SK플래닛 - 자바교육<br>
							삼성SDS멀티캠퍼스 - UML교육<br>
							삼성SDS - HTML5/하이브리드앱 교육
						</span>
						</p>
					</li>
					<li class="event" style="display:none;">
										
					</li>
					<li class="year">2012</li>
					<li class="event">
						<h3 class="heading">회사 창업 및 IT교육</h3>
						<span class="month"><i class="icon icon-calendar"></i>2012년</span>
						<p>
							<span class="mon-align-tw">4월.</span>
							<span class="mon-content">써니베일 법인 설립<br>
								비트-PHP/파이썬 프로그래밍 교육<br>
								SK커뮤니케이션즈-UML설계 교육<br>
								비트-JAVA/SQL 교육<br>
							</span>
						</p>
						<p>
							<span class="mon-align-tw">5월.</span>
							<span class="mon-content">기업용 SNS. 헬로마이오피스 개발 시작.<br>
							하이브리드 앱 - 모바일리더 기업 교육<br>
							비트-웹 표준 교육<br>
							비트-PHP 교육<br>
							비트-UML설계 교육<br>
								</span>
						</p>
						<p>
							<span class="mon-align-tw">6월.</span>
							<span class="mon-content">삼성전자 - 자바 성능을 결정짓는 코딩 습관과 튜닝 교육<br>
							삼성 SDS 신입사원 교육<br>
								</span>
						</p>
						<p>
							<span class="mon-align-tw">7월.</span>
							<span class="mon-content">
							삼성 SDS 신입사원 교육<br>
							</span>
						</p>
						<p>
							<span class="mon-align-tw">8월.</span>
							<span class="mon-content">
							신한 금융 - BA과정 교육<br>
								한화 S&C - Oracle, JAVA, XML 교육<br>
							</span>
						</p>
						<p>
							<span class="mon-align-tw">9월.</span>
							<span class="mon-content">
								한화 S&C - Oracle, JAVA, XML 교육<br>
								국세청 - JAVA, UML분석/설계 교육
							</span>
						</p>
						<p>
							<span class="mon-align-tw">10월.</span>
							<span class="mon-content">
							삼성 SDS SW Eng - 자바프레임워크 교육<br>
								삼성전자 - HTML5 교육<br>
							</span>
						</p>
						<p>
							<span class="mon-align-tw">11월.</span>
							<span class="mon-content">
								한화 S&C - 안드로이드 교육<br>
								삼성반도체-JAVA 교육<br>
							</span>
						</p>
						<p>
							<span class="mon-align-tw">12월.</span>
							<span class="mon-content">
								삼성SDS 역량강화 교육<br>
								비트-나무인터넷-PHP교육<br>
							</span>
						</p>
					</li>
				</ul>

			</div>
		</section>
		<!-- end resume -->

		<!-- projects -->
		<section class="section projects" id="projects">
			<div class="container">
				<h2 class="heading">교육</h2>
				<h3>신입 사원 전문 IT 교육</h3>
				<p>다양한 기업의 신입사원 IT교육 노하우가 있습니다. 언제든 연락주세요.</p>
				<p>&nbsp;</p>
				<h3>기업 IT 교육</h3>
				<p>&nbsp;</p>
				<p>자바 기본, 데이터베이스, Spring, UML, 분석/설계 등 다양한 기업 IT교육 경험이 있습니다. 언제든 연락주세요.</p>
			</div>
		</section>
		<!-- end projects -->

		<!-- contacts -->
		<section class="section contacts" id="contacts">
			<div class="container">
				<div class="row contact-address">
					<div class="col-md-12" style="margin-top: 50px;">
						<p class="address-lines-tit"><spring:message code="contact-Come-Visit" /></p>
						<div class="address-lines">
							<p>Email : carami at nate.com</p>
						</div>
						<!--
						<div class="social">
							<h3 class="sub-heading">Follow us on :</h3>
							<ul class="social-icons">
								<li><a href="https://www.facebook.com/sunnyvalesoft" target="_blank"><i class="icon icon-facebook"></i></a></li>
							</ul>
						</div>
						-->
					</div>
				</div>
			</div>	
		</section>
		<!-- end contacts -->
	
		<!-- footer -->
		<footer class="footer">
			<p>Copyright &copy; by Sunnyvale co., ltd. All right reserved.</p>
		</footer>
		<!-- end footer -->

	</div>
	<!-- END WRAPPER -->

	<!-- Javascript -->
	<script type="text/javascript" src="assets/js/jquery-1.7.2.min.js"></script>
	<script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="assets/js/modernizr.js"></script>
	<script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=true"></script>
	<script type="text/javascript" src="assets/js/jquery.ui.map.full.min.js?ver=3.0"></script>
	<script type="text/javascript" src="assets/js/jquery.scrollTo-1.4.3.1-min.js"></script>
	<script type="text/javascript" src="assets/js/jquery.localscroll-1.2.7-min.js"></script>	
	<script type="text/javascript" src="assets/js/main.js"></script>

</body>
</html>

