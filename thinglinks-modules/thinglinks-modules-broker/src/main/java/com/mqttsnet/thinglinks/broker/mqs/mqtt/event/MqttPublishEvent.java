package com.mqttsnet.thinglinks.broker.mqs.mqtt.event;

import com.mqttsnet.thinglinks.broker.api.domain.enumeration.MqttEventEnum;
import org.springframework.context.ApplicationEvent;

/**
 * @program: thinglinks
 * @description: MqttPublishEvent
 * @packagename: com.mqttsnet.thinglinks.mqtt.event
 * @author: ShiHuan Sun
 * @e-mainl: 13733918655@163.com
 * @date: 2023-04-28 01:13
 **/
public class MqttPublishEvent extends ApplicationEvent {
    private String message;
    private MqttEventEnum eventType;

    public MqttPublishEvent(Object source, MqttEventEnum eventType, String message) {
        super(source);
        this.message = message;
        this.eventType = eventType;
    }

    public String getMessage() {
        return message;
    }

    public MqttEventEnum getEventType() {
        return eventType;
    }
}

