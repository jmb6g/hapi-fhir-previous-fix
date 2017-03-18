package org.hl7.fhir.dstu3.model.codesystems;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Sat, Mar 4, 2017 06:58-0500 for FHIR v1.9.0


import org.hl7.fhir.exceptions.FHIRException;

public enum EndpointPayloadType {

        /**
         * Any payload type can be used with this endpoint, it is either a payload agnostic infrastructure (such as a storage repository), or some other type of endpoint where payload considerations are internally handled, and not available
         */
        ANY, 
        /**
         * This endpoint does not require any content to be sent, simply connecting to the endpoint is enough notification. This can be used as a 'ping' to wakeup a service to retrieve content, which could be to ensure security considerations are correctly handled
         */
        NONE, 
        /**
         * added to help the parsers
         */
        NULL;
        public static EndpointPayloadType fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("any".equals(codeString))
          return ANY;
        if ("none".equals(codeString))
          return NONE;
        throw new FHIRException("Unknown EndpointPayloadType code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case ANY: return "any";
            case NONE: return "none";
            default: return "?";
          }
        }
        public String getSystem() {
          return "http://hl7.org/fhir/endpoint-payload-type";
        }
        public String getDefinition() {
          switch (this) {
            case ANY: return "Any payload type can be used with this endpoint, it is either a payload agnostic infrastructure (such as a storage repository), or some other type of endpoint where payload considerations are internally handled, and not available";
            case NONE: return "This endpoint does not require any content to be sent, simply connecting to the endpoint is enough notification. This can be used as a 'ping' to wakeup a service to retrieve content, which could be to ensure security considerations are correctly handled";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case ANY: return "Any";
            case NONE: return "None";
            default: return "?";
          }
    }


}

