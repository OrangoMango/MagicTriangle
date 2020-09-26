echo "Running in src the JAVA main class com.orangomango.magictriangle.Main"
javac -d ../classes com/orangomango/magictriangle/*
cd ../classes
java com.orangomango.magictriangle.Main
cd ../src
