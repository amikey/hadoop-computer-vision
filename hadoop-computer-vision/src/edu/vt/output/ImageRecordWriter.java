package edu.vt.output;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.RecordWriter;
import org.apache.hadoop.mapreduce.TaskAttemptContext;

import edu.vt.io.Image;

import static com.googlecode.javacv.cpp.opencv_core.*;

public class ImageRecordWriter extends RecordWriter<Text, Image> {

	@Override
	public void close(TaskAttemptContext context) throws IOException,
			InterruptedException {
		
	}

	@Override
	public void write(Text key, Image value) throws IOException,
			InterruptedException {
		//cvEncodeImage("", );
		
	}

}