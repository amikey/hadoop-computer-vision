Running Hadoop: 
=============== 

../bin/hadoop fs -put input input
../bin/hadoop fs -rmr output
../bin/hadoop jar hadoop-computer-vision.jar edu.vt.example.Histogram input output
../bin/hadoop fs -get output output



OpenCV Installation: 
==================== 

For the list of prerequisites and more detailed installation guide, please, see http://opencv.willowgarage.com/wiki/InstallGuide 

The procedure at glance: 
------------------------
1. tar -xjf OpenCV-2.2.0.tar.bz2 
2. mkdir opencv.build 
3. cd opencv.build 
4. cmake ../OpenCV-2.2.0
5. make -j 2 
6. sudo make install 
7. sudo ldconfig 
