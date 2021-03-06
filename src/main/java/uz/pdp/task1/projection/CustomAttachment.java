package uz.pdp.task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.task1.entity.Attachment;

@Projection(types = Attachment.class)
public interface CustomAttachment {
    int getId();

    String getName();

    long getSize();

    String getContentType();
}
