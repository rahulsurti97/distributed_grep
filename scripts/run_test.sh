cd /home/ssaxen4/ECE428_mp1/src/
rm ece428/tests/*.class
javac -cp . ece428/tests/*.java
java -cp . ece428/tests/UnitTests > test_result.txt
