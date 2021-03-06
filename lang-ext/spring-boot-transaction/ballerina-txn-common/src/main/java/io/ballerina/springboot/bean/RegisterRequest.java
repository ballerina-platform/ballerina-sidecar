/*
 *  Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package io.ballerina.springboot.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Register Request Message Bean.
 *
 * @since 1.0.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RegisterRequest {

    private String transactionId;
    private int transactionBlockId;
    private String registerAtUrl;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public int getTransactionBlockId() {
        return transactionBlockId;
    }

    public void setTransactionBlockId(int transactionBlockId) {
        this.transactionBlockId = transactionBlockId;
    }

    public String getRegisterAtUrl() {
        return registerAtUrl;
    }

    public void setRegisterAtUrl(String registerAtUrl) {
        this.registerAtUrl = registerAtUrl;
    }

    @Override
    public String toString() {
        return "Transaction Register Request {" +
                "transactionId : '" + transactionId + '\'' +
                "registerAtUrl : '" + registerAtUrl + '\'' +
                "transactionBlockId : '" + transactionBlockId + '\'' +
                '}';
    }
}
