<?php
$id=$_POST["id"];
$name=$_POST["name"];
$buildTime=$_POST["buildTime"];
$master=$_POST["master"];
$conn=mysql_connect($id,$name,$buildTime,$master);

mysql_select_db("mysql");
$str="select * from sluice_t;";
$result=mysql_query($str);
for ($i=0; $arr[$i]=mysql_fetch_assoc($result)  ; $i++) ;
array_pop($arr);
$arr=json_encode($arr);
echo $arr;
mysql_close($conn);
?>