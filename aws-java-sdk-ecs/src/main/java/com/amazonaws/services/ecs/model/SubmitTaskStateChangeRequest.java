/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/SubmitTaskStateChange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubmitTaskStateChangeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the task.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * The task ID or full Amazon Resource Name (ARN) of the task in the state change request.
     * </p>
     */
    private String task;
    /**
     * <p>
     * The status of the state change request.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The reason for the state change request.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * Any containers associated with the state change request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ContainerStateChange> containers;
    /**
     * <p>
     * Any attachments associated with the state change request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AttachmentStateChange> attachments;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the task.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that hosts the task.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the task.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the cluster that hosts the task.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the task.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that hosts the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitTaskStateChangeRequest withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * The task ID or full Amazon Resource Name (ARN) of the task in the state change request.
     * </p>
     * 
     * @param task
     *        The task ID or full Amazon Resource Name (ARN) of the task in the state change request.
     */

    public void setTask(String task) {
        this.task = task;
    }

    /**
     * <p>
     * The task ID or full Amazon Resource Name (ARN) of the task in the state change request.
     * </p>
     * 
     * @return The task ID or full Amazon Resource Name (ARN) of the task in the state change request.
     */

    public String getTask() {
        return this.task;
    }

    /**
     * <p>
     * The task ID or full Amazon Resource Name (ARN) of the task in the state change request.
     * </p>
     * 
     * @param task
     *        The task ID or full Amazon Resource Name (ARN) of the task in the state change request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitTaskStateChangeRequest withTask(String task) {
        setTask(task);
        return this;
    }

    /**
     * <p>
     * The status of the state change request.
     * </p>
     * 
     * @param status
     *        The status of the state change request.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the state change request.
     * </p>
     * 
     * @return The status of the state change request.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the state change request.
     * </p>
     * 
     * @param status
     *        The status of the state change request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitTaskStateChangeRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The reason for the state change request.
     * </p>
     * 
     * @param reason
     *        The reason for the state change request.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for the state change request.
     * </p>
     * 
     * @return The reason for the state change request.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason for the state change request.
     * </p>
     * 
     * @param reason
     *        The reason for the state change request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitTaskStateChangeRequest withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * Any containers associated with the state change request.
     * </p>
     * 
     * @return Any containers associated with the state change request.
     */

    public java.util.List<ContainerStateChange> getContainers() {
        if (containers == null) {
            containers = new com.amazonaws.internal.SdkInternalList<ContainerStateChange>();
        }
        return containers;
    }

    /**
     * <p>
     * Any containers associated with the state change request.
     * </p>
     * 
     * @param containers
     *        Any containers associated with the state change request.
     */

    public void setContainers(java.util.Collection<ContainerStateChange> containers) {
        if (containers == null) {
            this.containers = null;
            return;
        }

        this.containers = new com.amazonaws.internal.SdkInternalList<ContainerStateChange>(containers);
    }

    /**
     * <p>
     * Any containers associated with the state change request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainers(java.util.Collection)} or {@link #withContainers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param containers
     *        Any containers associated with the state change request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitTaskStateChangeRequest withContainers(ContainerStateChange... containers) {
        if (this.containers == null) {
            setContainers(new com.amazonaws.internal.SdkInternalList<ContainerStateChange>(containers.length));
        }
        for (ContainerStateChange ele : containers) {
            this.containers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any containers associated with the state change request.
     * </p>
     * 
     * @param containers
     *        Any containers associated with the state change request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitTaskStateChangeRequest withContainers(java.util.Collection<ContainerStateChange> containers) {
        setContainers(containers);
        return this;
    }

    /**
     * <p>
     * Any attachments associated with the state change request.
     * </p>
     * 
     * @return Any attachments associated with the state change request.
     */

    public java.util.List<AttachmentStateChange> getAttachments() {
        if (attachments == null) {
            attachments = new com.amazonaws.internal.SdkInternalList<AttachmentStateChange>();
        }
        return attachments;
    }

    /**
     * <p>
     * Any attachments associated with the state change request.
     * </p>
     * 
     * @param attachments
     *        Any attachments associated with the state change request.
     */

    public void setAttachments(java.util.Collection<AttachmentStateChange> attachments) {
        if (attachments == null) {
            this.attachments = null;
            return;
        }

        this.attachments = new com.amazonaws.internal.SdkInternalList<AttachmentStateChange>(attachments);
    }

    /**
     * <p>
     * Any attachments associated with the state change request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachments(java.util.Collection)} or {@link #withAttachments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attachments
     *        Any attachments associated with the state change request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitTaskStateChangeRequest withAttachments(AttachmentStateChange... attachments) {
        if (this.attachments == null) {
            setAttachments(new com.amazonaws.internal.SdkInternalList<AttachmentStateChange>(attachments.length));
        }
        for (AttachmentStateChange ele : attachments) {
            this.attachments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any attachments associated with the state change request.
     * </p>
     * 
     * @param attachments
     *        Any attachments associated with the state change request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitTaskStateChangeRequest withAttachments(java.util.Collection<AttachmentStateChange> attachments) {
        setAttachments(attachments);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCluster() != null)
            sb.append("Cluster: ").append(getCluster()).append(",");
        if (getTask() != null)
            sb.append("Task: ").append(getTask()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getContainers() != null)
            sb.append("Containers: ").append(getContainers()).append(",");
        if (getAttachments() != null)
            sb.append("Attachments: ").append(getAttachments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubmitTaskStateChangeRequest == false)
            return false;
        SubmitTaskStateChangeRequest other = (SubmitTaskStateChangeRequest) obj;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getTask() == null ^ this.getTask() == null)
            return false;
        if (other.getTask() != null && other.getTask().equals(this.getTask()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getContainers() == null ^ this.getContainers() == null)
            return false;
        if (other.getContainers() != null && other.getContainers().equals(this.getContainers()) == false)
            return false;
        if (other.getAttachments() == null ^ this.getAttachments() == null)
            return false;
        if (other.getAttachments() != null && other.getAttachments().equals(this.getAttachments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getTask() == null) ? 0 : getTask().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getContainers() == null) ? 0 : getContainers().hashCode());
        hashCode = prime * hashCode + ((getAttachments() == null) ? 0 : getAttachments().hashCode());
        return hashCode;
    }

    @Override
    public SubmitTaskStateChangeRequest clone() {
        return (SubmitTaskStateChangeRequest) super.clone();
    }

}
