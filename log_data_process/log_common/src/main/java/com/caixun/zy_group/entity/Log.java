package com.caixun.zy_group.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import java.io.Serializable;

//指定document对应的索引名和type
@Document(indexName = "log_1",type = "testLog")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Log implements Serializable {

    @Id
    private String id;
    @Field(index = true)
    private String contentType;
    @Field(index = true)
    private String description;
    @Field(index = true)
    private String message;
    @Field(index = true)
    private String host_ip;
    @Field(index = true)
    private long timestamp;

    @Override
    public String toString() {
        return "Log{" +
                "id='" + id + '\'' +
                ", contentType='" + contentType + '\'' +
                ", description='" + description + '\'' +
                ", message='" + message + '\'' +
                ", host_ip='" + host_ip + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
