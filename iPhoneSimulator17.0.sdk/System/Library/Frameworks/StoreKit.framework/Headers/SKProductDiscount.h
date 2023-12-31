//
//  SKProductDiscount.h
//  StoreKit
//
//  Copyright © 2017 Apple Inc. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <StoreKit/StoreKitDefines.h>

@class SKProductSubscriptionPeriod;

typedef NS_ENUM(NSUInteger, SKProductDiscountPaymentMode) {
    SKProductDiscountPaymentModePayAsYouGo,
    SKProductDiscountPaymentModePayUpFront,
    SKProductDiscountPaymentModeFreeTrial
} NS_SWIFT_NAME(SKProductDiscount.PaymentMode) API_AVAILABLE(ios(11.2), macos(10.13.2), watchos(6.2), visionos(1.0));

typedef NS_ENUM(NSUInteger, SKProductDiscountType) {
    SKProductDiscountTypeIntroductory,
    SKProductDiscountTypeSubscription,
} NS_SWIFT_NAME(SKProductDiscount.Type) API_AVAILABLE(ios(12.2), macos(10.14.4), watchos(6.2), visionos(1.0));

NS_ASSUME_NONNULL_BEGIN

SK_EXTERN_CLASS API_AVAILABLE(ios(11.2), macos(10.13.2), visionos(1.0)) NS_SWIFT_SENDABLE @interface SKProductDiscount : NSObject {
@private
    id _internal;
}

@property(nonatomic, readonly) NSDecimalNumber *price API_AVAILABLE(ios(11.2), macos(10.13.2), watchos(6.2), visionos(1.0));

@property(nonatomic, readonly) NSLocale *priceLocale API_AVAILABLE(ios(11.2), macos(10.13.2), watchos(6.2), visionos(1.0));

@property(nonatomic, readonly, nullable) NSString *identifier API_AVAILABLE(ios(12.2), macos(10.14.4), watchos(6.2), visionos(1.0));

@property(nonatomic, readonly) SKProductSubscriptionPeriod *subscriptionPeriod API_AVAILABLE(ios(11.2), macos(10.13.2), watchos(6.2), visionos(1.0));

@property(nonatomic, readonly) NSUInteger numberOfPeriods API_AVAILABLE(ios(11.2), macos(10.13.2), watchos(6.2), visionos(1.0));

@property(nonatomic, readonly) SKProductDiscountPaymentMode paymentMode API_AVAILABLE(ios(11.2), macos(10.13.2), watchos(6.2), visionos(1.0));

@property(nonatomic, readonly) SKProductDiscountType type API_AVAILABLE(ios(12.2), macos(10.14.4), watchos(6.2), visionos(1.0));

@end

NS_ASSUME_NONNULL_END
