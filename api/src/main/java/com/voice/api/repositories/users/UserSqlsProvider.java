package com.voice.api.repositories.users;

import com.voice.api.Dtos.UserInfo;

import java.text.MessageFormat;
import java.util.List;
import java.util.Map;

public class UserSqlsProvider {
    public String batchInsert(Map<String, List<UserInfo>> map) {
        List<UserInfo> users = map.get("list");
        StringBuilder stringBuilder = new StringBuilder(256);
        stringBuilder.append("insert into user(username,password)  values");
        MessageFormat messageFormat = new MessageFormat("(#'{'list[{0}].userName,jdbcType=VARCHAR}, " +
                "#'{'list[{0}].password,jdbcType=VARCHAR})");
        for (int i = 0; i < users.size(); i++) {
            stringBuilder.append(messageFormat.format(new Integer[]{i}));
            stringBuilder.append(",");
        }
        stringBuilder.setLength(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }
}
