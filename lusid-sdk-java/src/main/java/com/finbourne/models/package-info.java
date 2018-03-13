// Copyright © 2018 FINBOURNE TECHNOLOGY LTD
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to
// deal in the Software without restriction, including without limitation the
// rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
// sell copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
// FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
// IN THE SOFTWARE.

/**
 * This package contains the models classes for FINBOURNEAPI.
 * # Immutable Events
 A core tenet of the LUSID platform is the concept of an immutable data store.  This gives the ability to consistently reproduce the state of the system for any given point in bi-temporal space.  In order to achieve this LUSID has implemented an append only event store for all data types.  New events, including historical amendments, are added to the end of the event stream and then played back in order to construct the state.  Given that all the events from T0 are required in order to reconstruct the state, there can be significant computational complexity and cost involved.  FINBOURNE have employed a number of techniques and optimisations in order to produce consistent performance characteristics e.g. using snapshots which has resulted in a highly performance and scalable platform.
 # Scope
 All entities within LUSID live within a logical partitioning of data know as a scope.  Any given entity can only live within one scope and is addressable with a unique identifier.
 For example, prices for equities from different vendors may be uploaded into different scopes such as `client/vendor1` and `client/vendor2`.  A portfolio may then be valued using either of the price sources by referencing the appropriate scope.
 It should be noted that scopes are not hierarchical and 2 different scopes which may contain the same path elements do not have any relationship.
 # Data Model
 Below is a summary of the key data types exposed via the API and their relationships.
 ## Schema
 A detailed description of the entities used by the API and parameters for endpoints which take a JSON document can be retrieved via the `schema` endpoint.
 ## Securities
 LUSID has its own security master implementation (LUSID CORE) which sources reference data form multiple data vendors.  With the appropriate entitlements, clients are able to upload securities into their portfolios using any OpenFIGI identifier.
 Cash can be uploaded using the ISO currency code prefixed with "`CCY_`" e.g. `CCY_GBP`
 For any securities that a client wants to upload but it not supported or recognised by LUSID, LUSID provides the ability to upload a client defined security.  A client defined security is only available within a client's data scope (subject to appropriate entitlements) and also has the ability to have properties and analytics attached to it.  Securitised portfolios and funds can be modelled as client defined securities.
 ## Trade
 A trade represents a transaction in a security or cash.
 ## Holding
 A holding represents an aggregate position in a security or cash on a given `effectiveDate`.  When uploading a holding for a given `effectiveDate`, LUSID will generate any trades required to construct the holding position from previous holdings.  Any generated trades will be marked with a source of `SYSTEM`.
 ## Portfolio
 A portfolio is a container for trades.  Meta data and classifications of portfolios can be attached via properties.
 LUSID also allows for a portfolio to be composed of another portfolio via derived portfolios.  A derived portfolio can contain its own trades and also inherits any trades from a reference portfolio.  Any changes made to the underlying reference portfolio are automatically reflected in derived portfolio.
 Reference portfolios in conjunction with scopes are a powerful construct.  For example, to do pre-trade what-if analysis, a reference portfolio could be created a new namespace linked to the underlying live portfolio.  Analysis can then be undertaken within the reference portfolio without affecting the live portfolio.
 ## Property
 Properties are key-value pairs that can be applied to any entity within a domain (where a domain is `trade`, `portfolio`, `security` etc).  Properties must be defined before use with a `PropertyDefinition` and can then subsequently be added to entities.
 # Movements Engine
 When generating holdings, LUSID passes trades through its Movements Engine which will manage cash flows within the portfolio such as cash balance adjustments, fees, tax etc.
 # Examples
 ## Authentication
 ## Create Portfolio
 ## Add Trades
 ## Add Holdings
 ## Update Trade/Holding
 ## Aggregation
 # Error Codes
 ## 100
 ### Personalisations not found.\n\nThe personalisation(s) identified by the pattern provided could not be found, either because it does not exist or it has been deleted. Please check the pattern your provided.
 ## 101
 NonRecursivePersonalisation
 ## 102
 VersionNotFound
 ## 104
 SecurityByCodeNotFound
 ## 104
 SecurityByCodeNotFound
 ## 105
 PropertyNotFound
 ## 106
 PortfolioRecursionDepth
 ## 108
 GroupNotFound
 ## 109
 PortfolioNotFound
 ## 110
 PropertySchemaNotFound
 ## 112
 PortfolioWithIdAlreadyExists
 ## 113
 OrphanedPortfolio
 ## 119
 MissingBaseClaims
 ## 121
 PropertyNotDefined
 ## 122
 CannotDeleteSystemProperty
 ## 123
 CannotModifyImmutablePropertyField
 ## 124
 PropertyAlreadyExists
 ## 125
 InvalidPropertyLifeTime
 ## 127
 CannotModifyDefaultPropertyFormat
 ## 128
 GroupAlreadyExists
 ## 129
 NoSuchPropertyDataFormat
 ## 132
 ValidationError
 ## 133
 LoopDetectedInGroupHierarchy
 ## 135
 SubGroupAlreadyExists
 ## 138
 PriceSourceNotFound
 ## 139
 AnalyticStoreNotFound
 ## 141
 AnalyticStoreAlreadyExists
 ## 143
 ClientSecurityAlreadyExists
 ## 144
 DuplicateInParameterSet
 ## 147
 ResultsNotFound
 ## 148
 OrderFieldNotInResultSet
 ## 149
 OperationFailed
 ## 150
 ElasticSearchError
 ## 151
 InvalidParameterValue
 ## 152
 ServerConfigurationError
 ## 153
 CommandProcessingFailure
 ## 154
 EntityStateConstructionFailure
 ## 155
 EntityTimelineDoesNotExist
 ## 156
 EventPublishFailure
 ## 157
 InvalidRequestFailure
 ## 158
 EventPublishUnknown
 ## 159
 EventQueryFailure
 ## 160
 BlobDidNotExistFailure
 ## 162
 SubSystemRequestFailure
 ## 163
 SubSystemConfigurationFailure
 ## 165
 FailedToDelete
 ## 166
 UpsertClientSecurityFailure
 ## 167
 IllegalAsAtInterval
 ## 168
 IllegalBitemporalQuery
 ## 169
 InvalidAlternateId
 ## 170
 CannotAddSourcePortfolioPropertyExplicitly
 ## 171
 EntityAlreadyExistsInGroup
 ## 173
 EntityWithIdAlreadyExists
 ## 174
 PortfolioDetailsDoNotExist
 ## 176
 PortfolioWithNameAlreadyExists
 ## 177
 InvalidTrades
 ## 178
 ReferencePortfolioNotFound
 ## 179
 DuplicateIdFailure
 ## 180
 CommandRetrievalFailure
 ## 181
 DataFilterApplicationFailure
 ## 182
 SearchFailed
 ## -1
 Unknown error.
 */
package com.finbourne.models;
