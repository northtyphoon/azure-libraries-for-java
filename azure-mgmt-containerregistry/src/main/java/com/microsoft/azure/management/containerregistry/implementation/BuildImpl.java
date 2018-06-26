/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.containerregistry.implementation;

import java.util.List;

import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.containerregistry.Build;
import com.microsoft.azure.management.containerregistry.BuildStatus;
import com.microsoft.azure.management.containerregistry.BuildType;
import com.microsoft.azure.management.containerregistry.GitCommitTrigger;
import com.microsoft.azure.management.containerregistry.ImageDescriptor;
import com.microsoft.azure.management.containerregistry.ImageUpdateTrigger;
import com.microsoft.azure.management.containerregistry.PlatformProperties;
import com.microsoft.azure.management.resources.fluentcore.model.implementation.WrapperImpl;

import org.joda.time.DateTime;

import rx.Observable;

/**
 * Implementation for Build.
 */
@LangDefinition
public class BuildImpl
    extends WrapperImpl<BuildInner>
    implements Build {
    /**
     * Creates an instance of the build object.
     *
     * @param inner the inner object
     */
    BuildImpl(BuildInner inner) {
        super(inner);
    }

	@Override
	public String buildId() {
		return inner().buildId();
	}

	@Override
	public Build refresh() {
		return null;
	}

	@Override
	public Observable<Build> refreshAsync() {
		return null;
	}

	@Override
	public BuildStatus status() {    
		return inner().status();
	}

	@Override
	public DateTime lastUpdatedTime() {
		return inner().lastUpdatedTime();
	}

	@Override
	public BuildType buildType() {
		return inner().buildType();
	}

	@Override
	public DateTime createTime() {
		return inner().createTime();
	}

	@Override
	public DateTime startTime() {
		return inner().startTime();
	}

	@Override
	public DateTime finishTime() {
		return inner().finishTime();
	}

	@Override
	public List<ImageDescriptor> outputImages() {
		return inner().outputImages();
	}

	@Override
	public String buildTask() {
		return inner().buildTask();
	}

	@Override
	public ImageUpdateTrigger imageUpdateTrigger() {
		return inner().imageUpdateTrigger();
	}

	@Override
	public GitCommitTrigger gitCommitTrigger() {
		return inner().gitCommitTrigger();
	}

	@Override
	public Boolean isArchiveEnabled() {
		return inner().isArchiveEnabled();
	}

	@Override
	public PlatformProperties platform() {
		return inner().platform();
	}
}
