<html>
<body>
<?php
//An array :hold many values under a single name, and you can access the values by referring to an index number or name. 
$cars = array("Volvo", "BMW", "Toyota"); //Indexed array 

$Vehicle  = array("brand" => "Ford", "model" => "Mustang", "year" => 1964); 
//Associated array 

$automobile = array ( array("Volvo",22,18),  array("BMW",15,13),  array("Saab",5,2), array("Land Rover",17,15) ); //Multi-dimensional Array 

echo $automobile[0][0].": In stock: ".$cars[0][1].", sold: ".$cars[0][2].".<br>";

echo $Vehicle["year"]; //Aarray   

$cars = ["Volvo", "BMW", "Toyota"]; 
$cars = [
  "Volvo",
  "BMW",
  "Toyota"
];
echo $cars[0] //access the record
$cars[1] = "Ford"; //update the record 
unset($cars[1]); //remove the record
echo sort($cars) //sort the record 
//sort() - sort arrays in ascending order
//rsort() - sort arrays in descending order
//asort() - sort associative arrays in ascending order, according to the value
//ksort() - sort associative arrays in ascending order, according to the key
//arsort() - sort associative arrays in descending order, according to the value
//krsort() - sort associative arrays in descending order, according to the key
?>
</body>
</html>