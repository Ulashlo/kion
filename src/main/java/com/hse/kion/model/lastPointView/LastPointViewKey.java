package com.hse.kion.model.lastPointView;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.convert.WritingConverter;

@Getter
@AllArgsConstructor
public class LastPointViewKey {
    private long userId;
    private long videoId;

    @WritingConverter
    public enum LastPointViewKeyToStringConverter implements Converter<LastPointViewKey, String> {
        INSTANCE;

        @Override
        public String convert(LastPointViewKey source) {
            return source.userId + "::" + source.videoId;
        }
    }

    @ReadingConverter
    public enum StringToLastPointViewKeyConverter implements Converter<String, LastPointViewKey> {
        INSTANCE;

        @Override
        public LastPointViewKey convert(String source) {
            String[] split = source.split("::");
            if (split.length != 2) {
                throw new IllegalArgumentException("Key can not be parsed: " + source);
            }
            long pageId = Long.parseLong(split[0]);
            long threadId = Long.parseLong(split[1]);
            return new LastPointViewKey(pageId, threadId);
        }
    }
}
