
package com.finflow.events.userrecoverer;

import java.time.Instant;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UserCreatedFailedEvent
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sourceService",
    "sourceTopic",
    "sourcePartition",
    "sourceOffset",
    "sourceTimestamp",
    "userId",
    "email",
    "firstName",
    "lastName",
    "phone",
    "errorType",
    "errorMessage",
    "errorStack",
    "retryCount",
    "maxRetryCount"
})
@Generated("jsonschema2pojo")
public class UserCreatedFailedEvent {

    /**
     * Имя сервиса-источника события
     * (Required)
     * 
     */
    @JsonProperty("sourceService")
    @JsonPropertyDescription("\u0418\u043c\u044f \u0441\u0435\u0440\u0432\u0438\u0441\u0430-\u0438\u0441\u0442\u043e\u0447\u043d\u0438\u043a\u0430 \u0441\u043e\u0431\u044b\u0442\u0438\u044f")
    private String sourceService;
    /**
     * Kafka топик, из которого получено исходное событие
     * 
     */
    @JsonProperty("sourceTopic")
    @JsonPropertyDescription("Kafka \u0442\u043e\u043f\u0438\u043a, \u0438\u0437 \u043a\u043e\u0442\u043e\u0440\u043e\u0433\u043e \u043f\u043e\u043b\u0443\u0447\u0435\u043d\u043e \u0438\u0441\u0445\u043e\u0434\u043d\u043e\u0435 \u0441\u043e\u0431\u044b\u0442\u0438\u0435")
    private String sourceTopic;
    /**
     * Номер партиции Kafka
     * 
     */
    @JsonProperty("sourcePartition")
    @JsonPropertyDescription("\u041d\u043e\u043c\u0435\u0440 \u043f\u0430\u0440\u0442\u0438\u0446\u0438\u0438 Kafka")
    private Integer sourcePartition;
    /**
     * Смещение в партиции Kafka
     * 
     */
    @JsonProperty("sourceOffset")
    @JsonPropertyDescription("\u0421\u043c\u0435\u0449\u0435\u043d\u0438\u0435 \u0432 \u043f\u0430\u0440\u0442\u0438\u0446\u0438\u0438 Kafka")
    private Long sourceOffset;
    /**
     * Временная метка исходного события
     * 
     */
    @JsonProperty("sourceTimestamp")
    @JsonPropertyDescription("\u0412\u0440\u0435\u043c\u0435\u043d\u043d\u0430\u044f \u043c\u0435\u0442\u043a\u0430 \u0438\u0441\u0445\u043e\u0434\u043d\u043e\u0433\u043e \u0441\u043e\u0431\u044b\u0442\u0438\u044f")
    private Instant sourceTimestamp;
    /**
     * Уникальный идентификатор пользователя
     * (Required)
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("\u0423\u043d\u0438\u043a\u0430\u043b\u044c\u043d\u044b\u0439 \u0438\u0434\u0435\u043d\u0442\u0438\u0444\u0438\u043a\u0430\u0442\u043e\u0440 \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u044f")
    private UUID userId;
    /**
     * Email пользователя
     * (Required)
     * 
     */
    @JsonProperty("email")
    @JsonPropertyDescription("Email \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u044f")
    private String email;
    /**
     * Имя пользователя
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    @JsonPropertyDescription("\u0418\u043c\u044f \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u044f")
    private String firstName;
    /**
     * Фамилия пользователя
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    @JsonPropertyDescription("\u0424\u0430\u043c\u0438\u043b\u0438\u044f \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u044f")
    private String lastName;
    /**
     * Телефон пользователя
     * 
     */
    @JsonProperty("phone")
    @JsonPropertyDescription("\u0422\u0435\u043b\u0435\u0444\u043e\u043d \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u044f")
    private String phone;
    /**
     * Тип ошибки (класс исключения)
     * (Required)
     * 
     */
    @JsonProperty("errorType")
    @JsonPropertyDescription("\u0422\u0438\u043f \u043e\u0448\u0438\u0431\u043a\u0438 (\u043a\u043b\u0430\u0441\u0441 \u0438\u0441\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u044f)")
    private String errorType;
    /**
     * Сообщение об ошибке
     * (Required)
     * 
     */
    @JsonProperty("errorMessage")
    @JsonPropertyDescription("\u0421\u043e\u043e\u0431\u0449\u0435\u043d\u0438\u0435 \u043e\u0431 \u043e\u0448\u0438\u0431\u043a\u0435")
    private String errorMessage;
    /**
     * Стек-трейс ошибки
     * 
     */
    @JsonProperty("errorStack")
    @JsonPropertyDescription("\u0421\u0442\u0435\u043a-\u0442\u0440\u0435\u0439\u0441 \u043e\u0448\u0438\u0431\u043a\u0438")
    private String errorStack;
    /**
     * Текущее количество попыток повторной обработки
     * 
     */
    @JsonProperty("retryCount")
    @JsonPropertyDescription("\u0422\u0435\u043a\u0443\u0449\u0435\u0435 \u043a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e \u043f\u043e\u043f\u044b\u0442\u043e\u043a \u043f\u043e\u0432\u0442\u043e\u0440\u043d\u043e\u0439 \u043e\u0431\u0440\u0430\u0431\u043e\u0442\u043a\u0438")
    private Integer retryCount;
    /**
     * Максимальное количество попыток повторной обработки
     * 
     */
    @JsonProperty("maxRetryCount")
    @JsonPropertyDescription("\u041c\u0430\u043a\u0441\u0438\u043c\u0430\u043b\u044c\u043d\u043e\u0435 \u043a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e \u043f\u043e\u043f\u044b\u0442\u043e\u043a \u043f\u043e\u0432\u0442\u043e\u0440\u043d\u043e\u0439 \u043e\u0431\u0440\u0430\u0431\u043e\u0442\u043a\u0438")
    private Integer maxRetryCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public UserCreatedFailedEvent() {
    }

    /**
     * 
     * @param sourcePartition
     *     Номер партиции Kafka.
     * @param lastName
     *     Фамилия пользователя.
     * @param sourceTopic
     *     Kafka топик, из которого получено исходное событие.
     * @param sourceTimestamp
     *     Временная метка исходного события.
     * @param errorType
     *     Тип ошибки (класс исключения).
     * @param retryCount
     *     Текущее количество попыток повторной обработки.
     * @param sourceOffset
     *     Смещение в партиции Kafka.
     * @param errorMessage
     *     Сообщение об ошибке.
     * @param maxRetryCount
     *     Максимальное количество попыток повторной обработки.
     * @param userId
     *     Уникальный идентификатор пользователя.
     * @param firstName
     *     Имя пользователя.
     * @param phone
     *     Телефон пользователя.
     * @param sourceService
     *     Имя сервиса-источника события.
     * @param errorStack
     *     Стек-трейс ошибки.
     * @param email
     *     Email пользователя.
     */
    public UserCreatedFailedEvent(String sourceService, String sourceTopic, Integer sourcePartition, Long sourceOffset, Instant sourceTimestamp, UUID userId, String email, String firstName, String lastName, String phone, String errorType, String errorMessage, String errorStack, Integer retryCount, Integer maxRetryCount) {
        super();
        this.sourceService = sourceService;
        this.sourceTopic = sourceTopic;
        this.sourcePartition = sourcePartition;
        this.sourceOffset = sourceOffset;
        this.sourceTimestamp = sourceTimestamp;
        this.userId = userId;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.errorType = errorType;
        this.errorMessage = errorMessage;
        this.errorStack = errorStack;
        this.retryCount = retryCount;
        this.maxRetryCount = maxRetryCount;
    }

    /**
     * Имя сервиса-источника события
     * (Required)
     * 
     */
    @JsonProperty("sourceService")
    public String getSourceService() {
        return sourceService;
    }

    /**
     * Имя сервиса-источника события
     * (Required)
     * 
     */
    @JsonProperty("sourceService")
    public void setSourceService(String sourceService) {
        this.sourceService = sourceService;
    }

    /**
     * Kafka топик, из которого получено исходное событие
     * 
     */
    @JsonProperty("sourceTopic")
    public String getSourceTopic() {
        return sourceTopic;
    }

    /**
     * Kafka топик, из которого получено исходное событие
     * 
     */
    @JsonProperty("sourceTopic")
    public void setSourceTopic(String sourceTopic) {
        this.sourceTopic = sourceTopic;
    }

    /**
     * Номер партиции Kafka
     * 
     */
    @JsonProperty("sourcePartition")
    public Integer getSourcePartition() {
        return sourcePartition;
    }

    /**
     * Номер партиции Kafka
     * 
     */
    @JsonProperty("sourcePartition")
    public void setSourcePartition(Integer sourcePartition) {
        this.sourcePartition = sourcePartition;
    }

    /**
     * Смещение в партиции Kafka
     * 
     */
    @JsonProperty("sourceOffset")
    public Long getSourceOffset() {
        return sourceOffset;
    }

    /**
     * Смещение в партиции Kafka
     * 
     */
    @JsonProperty("sourceOffset")
    public void setSourceOffset(Long sourceOffset) {
        this.sourceOffset = sourceOffset;
    }

    /**
     * Временная метка исходного события
     * 
     */
    @JsonProperty("sourceTimestamp")
    public Instant getSourceTimestamp() {
        return sourceTimestamp;
    }

    /**
     * Временная метка исходного события
     * 
     */
    @JsonProperty("sourceTimestamp")
    public void setSourceTimestamp(Instant sourceTimestamp) {
        this.sourceTimestamp = sourceTimestamp;
    }

    /**
     * Уникальный идентификатор пользователя
     * (Required)
     * 
     */
    @JsonProperty("userId")
    public UUID getUserId() {
        return userId;
    }

    /**
     * Уникальный идентификатор пользователя
     * (Required)
     * 
     */
    @JsonProperty("userId")
    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    /**
     * Email пользователя
     * (Required)
     * 
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * Email пользователя
     * (Required)
     * 
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Имя пользователя
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * Имя пользователя
     * (Required)
     * 
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Фамилия пользователя
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * Фамилия пользователя
     * (Required)
     * 
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Телефон пользователя
     * 
     */
    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    /**
     * Телефон пользователя
     * 
     */
    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Тип ошибки (класс исключения)
     * (Required)
     * 
     */
    @JsonProperty("errorType")
    public String getErrorType() {
        return errorType;
    }

    /**
     * Тип ошибки (класс исключения)
     * (Required)
     * 
     */
    @JsonProperty("errorType")
    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    /**
     * Сообщение об ошибке
     * (Required)
     * 
     */
    @JsonProperty("errorMessage")
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Сообщение об ошибке
     * (Required)
     * 
     */
    @JsonProperty("errorMessage")
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * Стек-трейс ошибки
     * 
     */
    @JsonProperty("errorStack")
    public String getErrorStack() {
        return errorStack;
    }

    /**
     * Стек-трейс ошибки
     * 
     */
    @JsonProperty("errorStack")
    public void setErrorStack(String errorStack) {
        this.errorStack = errorStack;
    }

    /**
     * Текущее количество попыток повторной обработки
     * 
     */
    @JsonProperty("retryCount")
    public Integer getRetryCount() {
        return retryCount;
    }

    /**
     * Текущее количество попыток повторной обработки
     * 
     */
    @JsonProperty("retryCount")
    public void setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
    }

    /**
     * Максимальное количество попыток повторной обработки
     * 
     */
    @JsonProperty("maxRetryCount")
    public Integer getMaxRetryCount() {
        return maxRetryCount;
    }

    /**
     * Максимальное количество попыток повторной обработки
     * 
     */
    @JsonProperty("maxRetryCount")
    public void setMaxRetryCount(Integer maxRetryCount) {
        this.maxRetryCount = maxRetryCount;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UserCreatedFailedEvent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sourceService");
        sb.append('=');
        sb.append(((this.sourceService == null)?"<null>":this.sourceService));
        sb.append(',');
        sb.append("sourceTopic");
        sb.append('=');
        sb.append(((this.sourceTopic == null)?"<null>":this.sourceTopic));
        sb.append(',');
        sb.append("sourcePartition");
        sb.append('=');
        sb.append(((this.sourcePartition == null)?"<null>":this.sourcePartition));
        sb.append(',');
        sb.append("sourceOffset");
        sb.append('=');
        sb.append(((this.sourceOffset == null)?"<null>":this.sourceOffset));
        sb.append(',');
        sb.append("sourceTimestamp");
        sb.append('=');
        sb.append(((this.sourceTimestamp == null)?"<null>":this.sourceTimestamp));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("phone");
        sb.append('=');
        sb.append(((this.phone == null)?"<null>":this.phone));
        sb.append(',');
        sb.append("errorType");
        sb.append('=');
        sb.append(((this.errorType == null)?"<null>":this.errorType));
        sb.append(',');
        sb.append("errorMessage");
        sb.append('=');
        sb.append(((this.errorMessage == null)?"<null>":this.errorMessage));
        sb.append(',');
        sb.append("errorStack");
        sb.append('=');
        sb.append(((this.errorStack == null)?"<null>":this.errorStack));
        sb.append(',');
        sb.append("retryCount");
        sb.append('=');
        sb.append(((this.retryCount == null)?"<null>":this.retryCount));
        sb.append(',');
        sb.append("maxRetryCount");
        sb.append('=');
        sb.append(((this.maxRetryCount == null)?"<null>":this.maxRetryCount));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.sourcePartition == null)? 0 :this.sourcePartition.hashCode()));
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.sourceTopic == null)? 0 :this.sourceTopic.hashCode()));
        result = ((result* 31)+((this.sourceTimestamp == null)? 0 :this.sourceTimestamp.hashCode()));
        result = ((result* 31)+((this.errorType == null)? 0 :this.errorType.hashCode()));
        result = ((result* 31)+((this.retryCount == null)? 0 :this.retryCount.hashCode()));
        result = ((result* 31)+((this.sourceOffset == null)? 0 :this.sourceOffset.hashCode()));
        result = ((result* 31)+((this.errorMessage == null)? 0 :this.errorMessage.hashCode()));
        result = ((result* 31)+((this.maxRetryCount == null)? 0 :this.maxRetryCount.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.phone == null)? 0 :this.phone.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sourceService == null)? 0 :this.sourceService.hashCode()));
        result = ((result* 31)+((this.errorStack == null)? 0 :this.errorStack.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserCreatedFailedEvent) == false) {
            return false;
        }
        UserCreatedFailedEvent rhs = ((UserCreatedFailedEvent) other);
        return (((((((((((((((((this.sourcePartition == rhs.sourcePartition)||((this.sourcePartition!= null)&&this.sourcePartition.equals(rhs.sourcePartition)))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.sourceTopic == rhs.sourceTopic)||((this.sourceTopic!= null)&&this.sourceTopic.equals(rhs.sourceTopic))))&&((this.sourceTimestamp == rhs.sourceTimestamp)||((this.sourceTimestamp!= null)&&this.sourceTimestamp.equals(rhs.sourceTimestamp))))&&((this.errorType == rhs.errorType)||((this.errorType!= null)&&this.errorType.equals(rhs.errorType))))&&((this.retryCount == rhs.retryCount)||((this.retryCount!= null)&&this.retryCount.equals(rhs.retryCount))))&&((this.sourceOffset == rhs.sourceOffset)||((this.sourceOffset!= null)&&this.sourceOffset.equals(rhs.sourceOffset))))&&((this.errorMessage == rhs.errorMessage)||((this.errorMessage!= null)&&this.errorMessage.equals(rhs.errorMessage))))&&((this.maxRetryCount == rhs.maxRetryCount)||((this.maxRetryCount!= null)&&this.maxRetryCount.equals(rhs.maxRetryCount))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.phone == rhs.phone)||((this.phone!= null)&&this.phone.equals(rhs.phone))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sourceService == rhs.sourceService)||((this.sourceService!= null)&&this.sourceService.equals(rhs.sourceService))))&&((this.errorStack == rhs.errorStack)||((this.errorStack!= null)&&this.errorStack.equals(rhs.errorStack))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))));
    }

}
