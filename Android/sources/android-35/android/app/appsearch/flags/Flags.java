/*
 * Copyright 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.app.appsearch.flags;

import android.app.appsearch.AppSearchSchema;

import java.util.Collection;

/**
 * Flags to control different features.
 *
 * <p>In Jetpack, those values can't be changed during runtime.
 *
 * @hide
 */
public final class Flags {
    private Flags() {}

    // The prefix of all the flags defined for AppSearch. The prefix has
    // "com.android.appsearch.flags", aka the package name for generated AppSearch flag classes in
    // the framework, plus an additional trailing '.'.
    private static final String FLAG_PREFIX = "com.android.appsearch.flags.";

    // The full string values for flags defined in the framework.
    //
    // The values of the static variables are the names of the flag defined in the framework's
    // aconfig files. E.g. "enable_safe_parcelable", with FLAG_PREFIX as the prefix.
    //
    // The name of the each static variable should be "FLAG_" + capitalized value of the flag.

    /** Enable SafeParcelable related features. */
    public static final String FLAG_ENABLE_SAFE_PARCELABLE_2 =
            FLAG_PREFIX + "enable_safe_parcelable_2";

    /** Enable the "hasProperty" function in list filter query expressions. */
    public static final String FLAG_ENABLE_LIST_FILTER_HAS_PROPERTY_FUNCTION =
            FLAG_PREFIX + "enable_list_filter_has_property_function";

    /** Enable Schema Type Grouping related features. */
    public static final String FLAG_ENABLE_GROUPING_TYPE_PER_SCHEMA =
            FLAG_PREFIX + "enable_grouping_type_per_schema";

    /** Enable GenericDocument to take another GenericDocument to copy construct. */
    public static final String FLAG_ENABLE_GENERIC_DOCUMENT_COPY_CONSTRUCTOR =
            FLAG_PREFIX + "enable_generic_document_copy_constructor";

    /**
     * Enable the {@link android.app.appsearch.SearchSpec.Builder#addFilterProperties} and {@link
     * android.app.appsearch.SearchSuggestionSpec.Builder#addFilterProperties}.
     */
    public static final String FLAG_ENABLE_SEARCH_SPEC_FILTER_PROPERTIES =
            FLAG_PREFIX + "enable_search_spec_filter_properties";

    /** Enable the {@link android.app.appsearch.SearchSpec.Builder#setSearchSourceLogTag} method. */
    public static final String FLAG_ENABLE_SEARCH_SPEC_SET_SEARCH_SOURCE_LOG_TAG =
            FLAG_PREFIX + "enable_search_spec_set_search_source_log_tag";

    /** Enable addTakenActions API in PutDocumentsRequest. */
    public static final String FLAG_ENABLE_PUT_DOCUMENTS_REQUEST_ADD_TAKEN_ACTIONS =
            FLAG_PREFIX + "enable_put_documents_request_add_taken_actions";

    /** Enable setPubliclyVisibleSchema in SetSchemaRequest. */
    public static final String FLAG_ENABLE_SET_PUBLICLY_VISIBLE_SCHEMA =
            FLAG_PREFIX + "enable_set_publicly_visible_schema";

    /**
     * Enable {@link android.app.appsearch.GenericDocument.Builder} to use previously hidden
     * methods.
     */
    public static final String FLAG_ENABLE_GENERIC_DOCUMENT_BUILDER_HIDDEN_METHODS =
            FLAG_PREFIX + "enable_generic_document_builder_hidden_methods";

    public static final String FLAG_ENABLE_SET_SCHEMA_VISIBLE_TO_CONFIGS =
            FLAG_PREFIX + "enable_set_schema_visible_to_configs";

    /** Enable {@link android.app.appsearch.EnterpriseGlobalSearchSession}. */
    public static final String FLAG_ENABLE_ENTERPRISE_GLOBAL_SEARCH_SESSION =
            FLAG_PREFIX + "enable_enterprise_global_search_session";

    /**
     * Enables {@link android.app.appsearch.functions.AppFunctionManager} and app functions related
     * stuff.
     */
    public static final String FLAG_ENABLE_APP_FUNCTIONS = FLAG_PREFIX + "enable_app_functions";

    /**
     * Enable {@link android.app.appsearch.AppSearchResult#RESULT_DENIED} and {@link
     * android.app.appsearch.AppSearchResult#RESULT_RATE_LIMITED} which were previously hidden.
     */
    public static final String FLAG_ENABLE_RESULT_DENIED_AND_RESULT_RATE_LIMITED =
            FLAG_PREFIX + "enable_result_denied_and_result_rate_limited";

    /**
     * Enables {@link AppSearchSchema#getParentTypes()}, {@link
     * AppSearchSchema.DocumentPropertyConfig#getIndexableNestedProperties()} and variants of {@link
     * AppSearchSchema.DocumentPropertyConfig.Builder#addIndexableNestedProperties(Collection)}}.
     */
    public static final String FLAG_ENABLE_GET_PARENT_TYPES_AND_INDEXABLE_NESTED_PROPERTIES =
            FLAG_PREFIX + "enable_get_parent_types_and_indexable_nested_properties";

    // Whether the features should be enabled.
    //
    // In Jetpack, those should always return true.

    /** Whether SafeParcelable should be enabled. */
    public static boolean enableSafeParcelable() {
        return true;
    }

    /** Whether the "hasProperty" function in list filter query expressions should be enabled. */
    public static boolean enableListFilterHasPropertyFunction() {
        return true;
    }

    /** Whether Schema Type Grouping should be enabled. */
    public static boolean enableGroupingTypePerSchema() {
        return true;
    }

    /** Whether Generic Document Copy Constructing should be enabled. */
    public static boolean enableGenericDocumentCopyConstructor() {
        return true;
    }

    /**
     * Whether the {@link android.app.appsearch.SearchSpec.Builder#addFilterProperties} and {@link
     * android.app.appsearch.SearchSuggestionSpec.Builder#addFilterProperties} should be enabled.
     */
    public static boolean enableSearchSpecFilterProperties() {
        return true;
    }

    /**
     * Whether the {@link android.app.appsearch.SearchSpec.Builder#setSearchSourceLogTag} should be
     * enabled.
     */
    public static boolean enableSearchSpecSetSearchSourceLogTag() {
        return true;
    }

    /** Whether addTakenActions API in PutDocumentsRequest should be enabled. */
    public static boolean enablePutDocumentsRequestAddTakenActions() {
        return true;
    }

    /** Whether setPubliclyVisibleSchema in SetSchemaRequest.Builder should be enabled. */
    public static boolean enableSetPubliclyVisibleSchema() {
        return true;
    }

    /**
     * Whether {@link android.app.appsearch.GenericDocument.Builder#setNamespace(String)}, {@link
     * android.app.appsearch.GenericDocument.Builder#setId(String)}, {@link
     * android.app.appsearch.GenericDocument.Builder#setSchemaType(String)}, and {@link
     * android.app.appsearch.GenericDocument.Builder#clearProperty(String)} should be enabled.
     */
    public static boolean enableGenericDocumentBuilderHiddenMethods() {
        return true;
    }

    /**
     * Whether {@link android.app.appsearch.SetSchemaRequest.Builder
     * #setSchemaTypeVisibilityForConfigs} should be enabled.
     */
    public static boolean enableSetSchemaVisibleToConfigs() {
        return true;
    }

    /** Whether {@link android.app.appsearch.EnterpriseGlobalSearchSession} should be enabled. */
    public static boolean enableEnterpriseGlobalSearchSession() {
        return true;
    }

    /**
     * Whether {@link android.app.appsearch.AppSearchResult#RESULT_DENIED} and {@link
     * android.app.appsearch.AppSearchResult#RESULT_RATE_LIMITED} should be enabled.
     */
    public static boolean enableResultDeniedAndResultRateLimited() {
        return true;
    }

    /**
     * Whether {@link AppSearchSchema#getParentTypes()}, {@link
     * AppSearchSchema.DocumentPropertyConfig#getIndexableNestedProperties()} and variants of {@link
     * AppSearchSchema.DocumentPropertyConfig.Builder#addIndexableNestedProperties(Collection)}}
     * should be enabled.
     */
    public static boolean enableGetParentTypesAndIndexableNestedProperties() {
        return true;
    }
}
