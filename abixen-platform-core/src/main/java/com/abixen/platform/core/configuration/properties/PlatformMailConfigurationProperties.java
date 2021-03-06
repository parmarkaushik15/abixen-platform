/**
 * Copyright (c) 2010-present Abixen Systems. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.abixen.platform.core.configuration.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import static com.abixen.platform.core.util.PlatformProfiles.DEV;
import static com.abixen.platform.core.util.PlatformProfiles.CLOUD;


@Profile({DEV, CLOUD})
@Component
@EnableConfigurationProperties(PlatformMailConfigurationProperties.class)
@ConfigurationProperties(prefix = "platform.core.mail.outgoing", locations = {"bootstrap.yml"})
public class PlatformMailConfigurationProperties extends AbstractPlatformMailConfigurationProperties {

}
