package com.bastawesy.spring.reactor.utils;

public class Constants {

    // Resources
    public static final String RESOURCE_NOT_FOUND_KEY = "resource.not.found";
    public static final String BUNDLE_LOCATION = "i18n/messages";
    public static final String VALIDATION_FIRST_DATE_SHOULD_BE_BEFORE_SECOND_DATE_ERROR = "date_validation.first_date_should_be_before_second_date.error";
    public static final String VALIDATION_DATE_SHOULD_BE_IN_THE_FUTURE_ERROR = "date_validation.date_should_be_in_the_future.error";
    public static final String VALIDATION_ACCOUNT_HAS_NO_AVAILABLE_QUOTA_ERROR = "allocation.not_enough_quota.error";
    public static final String VALIDATION_INVALID_ALLOCATION_VALUE_ERROR = "allocation.value_not_valid.error";
    public static final String VALIDATION_INVALID_ALLOCATION_SERVICE_KEY_ERROR = "allocation.service_key_not_valid.error";
    /*******************************************************
     * ------------* javax.validation.messages *-----------*
     *******************************************************/
    public static final String DEFAULT_ERROR_MESSAGE = "Error processing your request";
    public static final String HTTP_MESSAGE_NOT_READABLE_EXCEPTION_MESSAGE = "Invalid Json request";
    public static final String JSON_PARSE_EXCEPTION_MESSAGE = "Invalid json request";
    /* ------------* BalanceRequest Validation Messages *----------- */
    public static final String BALANCE_REQUEST_BASENAME_VALIDATION_MSG = " 'balanceBaseName' can not be blank or null ";
    public static final String BALANCE_REQUEST_ACCOUNT_ID_VALIDATION_MSG = " 'accountId' can not be blank or null ";
    public static final String BALANCE_REQUEST_SUBSCRIPTION_ID_VALIDATION_MSG = " 'subscriptionId' can not be blank or null ";
    public static final String BALANCE_REQUEST_VALUE_VALIDATION_MSG = " 'value' can not be blank or null ";
    public static final String BALANCE_REQUEST_BALANCE_TYPE_VALIDATION_MSG = " 'balanceType' can not be blank or null ";
    public static final String BALANCE_REQUEST_UNIT_VALIDATION_MSG = " 'unit' can not be blank or null ";
    public static final String BALANCE_REQUEST_PRIORITY_VALIDATION_MSG = " 'priority' can not be blank or null ";
    public static final String BALANCE_REQUEST_CREATED_BY_VALIDATION_MSG = " 'createdBy' can not be blank or null ";
    public static final String BALANCE_REQUEST_SERVICE_KEY_VALIDATION_MSG = " 'serviceKeys' can not be empty ";
    public static final String BALANCE_REQUEST_BALANCE_ID_VALIDATION_MSG = " 'balanceId' can not be blank or null ";
    public static final String BALANCE_REQUEST_SOURCE_VALIDATION_MSG = " 'source' can not be blank or null ";
    /* ------------* AllocationRequest Validation Messages *----------- */
    public static final String ALLOCATION_REQUEST_RESERVED_FOR_VALIDATION_MSG = " 'reservedFor' can not be blank or null ";
    public static final String ALLOCATION_REQUEST_SERVICE_KEY_VALIDATION_MSG = " 'serviceKey' can not be blank or null ";
    public static final String BALANCE_REQUEST_VALID_FROM_VALIDATION_MSG = " 'validFrom' can not be blank or null ";
    public static final String BALANCE_REQUEST_VALID_TO_VALIDATION_MSG = " 'validTo' can not be blank or null ";
    /* ------------* AllocationRequest Response Messages *----------- */
    public static final String ALLOCATION_CHECK_ALLOWED_MSG = "allocation.check.allowed.message";
    public static final String ALLOCATION_CHECK_ALLOWED_WITH_EXTRA_COST_MSG = "allocation.check.allowed_with_extra_cost.message";
    /* ------------* ReleaseReservationRequest Validation Messages *----------- */
    public static final String RELEASE_RESERVATION_REQUEST_RESERVED_FOR_VALIDATION_MSG = " 'reservedFor' can not be blank or null ";
    public static final String RELEASE_RESERVATION_REQUEST_RELEASED_BY_VALIDATION_MSG = " 'releasedBy' can not be blank or null ";
    private Constants() {
        throw new IllegalStateException("Utility class");
    }
}
