package com.midea.ac.weathertest.controller;

import com.midea.ac.weathertest.util.EncryptUtil;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

@RestController
@RequestMapping("v3/")
public class Controller {
    @RequestMapping("/weather/getAreaWeatherDetail")
    public Map getAreaWeatherDetail(@RequestBody Map map, HttpServletRequest request) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String accessKey = request.getParameter("accessKey");
        String accessId = request.getParameter("accessId");
        String sessionId = request.getParameter("sessionId");
        String sessionKey = request.getParameter("sessionKey");
        String aesKey;
        if (sessionId == null){
            aesKey = EncryptUtil.md5(accessKey);
        }else {
            aesKey = EncryptUtil.md5(accessKey + sessionKey);
        }
        String encryptData =(String) map.get("encryptData");

        String deByBase64 = EncryptUtil.base64(encryptData);



        String aesKey = EncryptUtil.md5(accessKey);
        return  null;
    }



}
