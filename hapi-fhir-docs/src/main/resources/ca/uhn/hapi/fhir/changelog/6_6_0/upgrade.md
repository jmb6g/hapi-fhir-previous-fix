This release changes database indexing for string and uri SearchParameters.
The database migration may take several minutes.
These changes will be applied automatically on first startup.
To avoid this delay on first startup, run the migration manually.

Bulk export behaviour is changing in this release such that Binary resources created as part of the response will now be created in the partition that the bulk export was requested rather than in the DEFAULT partition as was being done previously.

Bulk import behaviour is changing in this release such that data imported as part of the request will now create resources in the partition that the bulk import was requested rather than in the DEFAULT partition as was being done previously.
