package com.ch.resource;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;

@Path("/job")
public class JobResource {

	@POST
	@Path("/in")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	public StreamingOutput postJob(final InputStream in) {

		return (os) -> {
			int b = 0;
			while ((b = in.read()) != -1) {
				os.write(b);
			}
			os.close();
		};
	}

	@POST
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/reader")
	public String postJob(Reader reader) throws IOException {
		StringBuffer buffer = null;
		char[] data = null;
		BufferedReader bufferedReader = null;

		data = new char[25];
		buffer = new StringBuffer();
		bufferedReader = new BufferedReader(reader);
		while (bufferedReader.read(data) != -1) {
			buffer.append(data);
			data = new char[25];
		}

		bufferedReader.close();
		reader.close();
		return buffer.toString();
	}

	@POST
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/string")
	public String postJob(String jobContent) {
		return jobContent;
	}

	@POST
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/bytes")
	public byte[] postJob(byte[] jobBytes) {
		return jobBytes;
	}

	@POST
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces(MediaType.MULTIPART_FORM_DATA)
	@Path("/file")
	public File postJob(File jobFile) {
		return jobFile;
	}
}






