1. For getting UUID of drives: sudo blkid
2. Install ntfs-3g if needed.
3. Copy the codes from fstab to: /etc/fstab
4. Save and Reboot.


/dev/sda2: UUID="94F6A0C0F6A0A448" TYPE="ntfs" PARTUUID="25a3aba1-02"
/dev/sda5: LABEL="Tutorials" UUID="01D37888B5943230" TYPE="ntfs" PARTUUID="25a3aba1-05"
/dev/sda6: LABEL="Multimedia" UUID="01D37888DEB5FB30" TYPE="ntfs" PARTUUID="25a3aba1-06"
/dev/sda7: LABEL="My_Files" UUID="01D37888E029D680" TYPE="ntfs" PARTUUID="25a3aba1-07"

