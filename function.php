<? php 
function myMessage() {
  echo "Hello world!";
}

function familyName($fname) {
  echo "$fname Govindoooo.<br>";   }

familyName("Jani");
familyName("Hege");
familyName("Stale");
familyName("Kai Jim");
familyName("Borge");


//Default arguments value 
function setHeight($minheight = 50) {
  echo "The height is : $minheight <br>";
}

setHeight(350);
setHeight();
setHeight(135);
setHeight(80);

//return function 
function sum($x, $y) {
  $z = $x + $y;
  return $z;    }

echo "5 + 10 = " . sum(5,10) . "<br>";
echo "7 + 13 = " . sum(7,13) . "<br>";
echo "2 + 4 = " . sum(2,4);
?>
?>
