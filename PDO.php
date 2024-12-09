<?php
	$dsn = "mysql:host=localhost;dbname=gfg";
	$user = "root";
	$passwd = "";
	$pdo = new PDO($dsn, $user, $passwd);
	$stm = $pdo->query("SELECT * FROM students");
	$rows = $stm->fetchAll(PDO::FETCH_ASSOC);
	foreach($rows as $row) {
		printf("{$row['id']} {$row['name']}\n");
	}
?>
//To delete a rows
<?php
	try {
		$dbhost = 'localhost';
		$dbname='gfg';
		$dbuser = 'root';
		$dbpass = '';
		$connect = new PDO(
"mysql:host=$dbhost;dbname=$dbname", $dbuser, $dbpass);
	}
catch (PDOException $e) {
		echo "Error : " . $e->getMessage() . "<br/>";
		die();
	}
	$count = $connect->exec("DELETE FROM empdetail WHERE emp_id = 001 ");
	echo("Number of rows to be deleted from the employee table is: ". $count);
?>
//Supported Database:
MySQL
PostgreSQL
Oracle
Firebird
MS SQL Server
Sybase
Informix
IBM
FreeTDS
SQLite
Cubrid
4D 