<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>index</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <meta name="keywords" content="Flat Dark Web Login Form Responsive Templates, Iphone Widget Template, Smartphone login forms,Login form, Widget Template, Responsive Templates, a Ipad 404 Templates, Flat Responsive Templates" />
    <link href="css/style.css" rel='stylesheet' type='text/css' />
    <!--webfonts-->
    <link href='http://fonts.useso.com/css?family=PT+Sans:400,700,400italic,700italic|Oswald:400,300,700' rel='stylesheet' type='text/css'>
    <link href='http://fonts.useso.com/css?family=Exo+2' rel='stylesheet' type='text/css'>
    <!--//webfonts-->
    <script src="http://ajax.useso.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
</head>
<body>
<script>
    $(document).ready(function(c) {
    $('.close').on('click', function(c){
        $('.login-form').fadeOut('slow', function(c){
            $('.login-form').remove();
        });
    });
});
$(function(){
    alert()
    $("#commentOk").click(function(){
        $("#inputForm").submit();
    })

})

</script>
<!--SIGN UP-->
<h1>chenshuangfei</h1>
<div class="login-form">
    <div class="close"> </div>
    <div class="head-info">
        <label class="lbl-1"> </label>
        <label class="lbl-2"> </label>
        <label class="lbl-3"> </label>
    </div>
    <div class="clear"> </div>
    <div class="avtar">
        <img src="images/loginimages/avtar.png" />
    </div>
    <form method="post"  id="inputForm" action="doLoginServlet.do">
        <input type="text" class="text" name="userName" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '请填写用户名';}" >
        <div class="key">
            <input type="password" name="userPassword" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '请填写密码';}">
        </div>
        <div class="signin">
            <input type="submit" id="commentOk" value="Login" >
        </div>
    </form>

</div>


</body>
</html>