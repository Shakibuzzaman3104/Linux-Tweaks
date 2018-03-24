1. For getting UUID of drives: sudo blkid
2. Install ntfs-3g if needed.
3. Copy the codes from fstab to: /etc/fstab
4. Save and Reboot.


/dev/sda4: LABEL="Multimedia" UUID="F034EE3F34EE0904" TYPE="ntfs" PARTUUID="e36c3e67-c69b-4dcf-8a47-9e1c8b14b00f"
/dev/sda5: LABEL="My_Files" UUID="7646FD8B46FD4BFD" TYPE="ntfs" PARTUUID="06cf95c9-85e1-4bb1-a069-5b1492dd7cb6"
/dev/sda7: LABEL="Tutorials" UUID="764608084607C7B7" TYPE="ntfs" PARTUUID="0e382a93-fe81-4af3-aa45-c2e4d7154339"

