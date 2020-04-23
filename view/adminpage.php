<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Car Selling</title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <link href="../style.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="../js/jquery-1.3.2.min.js"></script>
    <script type="text/javascript" src="../js/script.js"></script>
    <script type="text/javascript" src="../js/cufon-yui.js"></script>
    <script type="text/javascript" src="../js/arial.js"></script>
    <script type="text/javascript" src="../js/cuf_run.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
      	a:link{ text-decoration: none;}
      	a:hover 
        {
          color: red;
          background-color: transparent;
          text-decoration: underline;
        }
    </style>
</head>
<body>
<div class="main">
  <div class="header">
    <div class="header_resize">
      <div class="logo">
       <h1><a href="#">CarSelling<span>CS</span><small>Online Car Sale Recommendation System</small></a></h1>
      </div>
      <div class="menu_nav">
        <ul>
          <li class="active"><a href="#">Admin Page</a></li>        
          <li><a href="../index.php">Back</a></li>
        </ul>
      </div>
      <div class="clr"></div>
    </div>
  </div>

<div class="content">
    <div class="content_resize">
      <div class="mainbar">
        <div class="article">
          <b><font face="Time New Roman" color="blue" size="5">Admin Login Page</font></b>  
          <br/><br/> 
          <form action="../files/adminlogin.php" method="POST">
              <table border="0" width="80%" cellspacing="0" cellpadding="0" >
                <tr>
                  <td align="left" height="50">
                      <b><font face="Time New Roman" color="#C9" size="3">Admin Name:</font></b>
                  </td>
                  <td align="left" height="50"> 
                    <input type="text" name="adminName" size="25"/>
                  </td>
                </tr>
                <tr>
                  <td align="left" height="50">
                      <b><font face="Time New Roman" color="#C9" size="3">Password:</font></b>
                  </td>
                  <td align="left" height="50"> 
                    <input type="password" name="password" size="25"/>
                  </td>
                </tr>
                <tr>
                    <td height="50" colspan="2" align="center"><b> <input type=submit value="Log In"></b>
                    </td>
                </tr>      
              </table>
          </form>
          
        </div>
      </div>

        <div class="sidebar">
          <div class="gadget">
            <div class="img"><img src="../images/images5.jpg" width="200" height="200" alt=""  /></div>
          </div>
        </div>
      </div>
    </div>
  </div>
    
  </body>
  </html>