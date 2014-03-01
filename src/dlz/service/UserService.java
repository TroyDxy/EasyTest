package dlz.service;

import org.json.JSONException;
import org.json.JSONObject;

import dlz.engine.Context;
import dlz.engine.IService;

public class UserService implements IService {
	public void execute(Context context) throws JSONException{
		JSONObject requestJSON  = context.getJsonRequestObject();
		JSONObject responseJSON  = new JSONObject();
		String operation = requestJSON.getString("operation");
		int returnCode = 0;
		if("getUserName".equals(operation)){
		String userId = requestJSON.getString("userId");
		returnCode = 0;
		String username;
		username = dlz.dao.UserDAO.getUsernameById(userId);
		String returnMsg = "我拿到数据啦";
		if(username == null) returnMsg="没";
		responseJSON.put("retuanCode", returnCode);
		responseJSON.put("returnMsg", returnMsg);
		responseJSON.put("returnData", username);
		}
		
		context.setJsonResponseObject(responseJSON);
	}
}
