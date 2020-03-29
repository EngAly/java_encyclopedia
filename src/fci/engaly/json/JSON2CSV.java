package fci.engaly.json;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;

import org.json.*;
import org.apache.commons.io.FileUtils;;

public class JSON2CSV {

	public static void main(String[] args) {

		String fileString;
		JSONObject output;
		try {
			fileString = FileUtils.readFileToString(new File("/media/MultiMedia/8.Mht/other-files/txt/Emails.json"));
			output = new JSONObject(fileString);
			JSONArray docs = output.getJSONArray("emails");
			File file = new File("EmpDetails.csv");
			String csv = CDL.toString(docs);
			FileUtils.writeStringToFile(file, csv);
			System.out.println("Data has been Sucessfully Writeen to " + file);
			System.out.println(csv);
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (IOException e) {

		} catch (Exception e) {

		}
	}
}
